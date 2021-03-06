<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%-- <%@include file="../includes/header.jsp"%> --%>
<%@include file="../includes/index_header.jsp"%>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">자유게시판</h1>
	</div>
	<!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">게시글 등록</div>
			<!-- /.panel-heading -->
			<div class="panel-body">
				<form role="form" action="/forum/register" method="post" id='register'>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
					<input type="hidden" name="bcategory" value="자유게시판"/>	
					<div class="form-group">
						<label>카테고리</label> <select name="pcategory">
							<option value="독서토론">독서토론</option>
							<option value="스터디">스터디</option>
							<option value="기타">기타</option>
						</select>
					</div>
					<div class="form-group">
						<label>제목</label> <input class="form-control" name="title">
					</div>

					<div class="form-group">
						<label>내용</label>
						<textarea class="form-control" rows="3" name="tbl_contents" placeholder="규정을 위반한 게시물은 경고 및 삭제 조치 될 수 있습니다."></textarea>
					</div>

					<div class="form-group">
						<label>작성자</label> <input class="form-control" name="user_id"
							value="<sec:authentication property='principal.username'/>"
							readonly="readonly">
					</div>

					<button type="submit" class="btn btn-default">등록</button>
					<button type="reset" class="btn btn-default">다시 작성</button>

				</form>
			</div>
			<!-- /.panel-body -->
		</div>
		<!-- /.panel -->
	</div>
	<!-- /.col-lg-6 -->
</div>
<!-- /.row -->

<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading">File Attach</div>
<!-- 			/.panel-heading  -->
			<div class="panel-body">
				<div class="form-group uploadDiv">
					<input type="file" name="uploadFile" multiple>
				</div>
				<div class='uploadResult'>
					<ul>

					</ul>
				</div>
			</div>
<!-- 			end panel-body -->
		</div>
<!-- 		end panel-body -->
	</div>
<!-- 	end panel -->
</div>
<!-- /.row -->

<script>
	$(document).ready(function(e) {
		
		
		
		var csrfHeaderName = "${_csrf.headerName}";
		var csrfTokenValue = "${_csrf.token}";

		$(".uploadResult").on("click","button",function(e) {
				console.log("delete file");

				var targetFile = $(this).data("file");
				var type = $(this).data("type");

				var targetLi = $(this).closest("li");

				$.ajax({url : '/deleteFile',
						data : {fileName : targetFile, type : type},
						beforeSend : function(xhr) {xhr.setRequestHeader(csrfHeaderName,csrfTokenValue);},
						dataType : 'text',
						type : 'POST',
						success : function(result) {
											alert(result);
											targetLi.remove();
										}

						});//$.ajax

				});

				var formObj = $("form[role='form']");

				$("button[type='submit']").on("click",function(e) {
						if(!formObj.find("input[name='title']").val()){
							alert("제목을 입력하세요");
							return false;
						}
						
						if(!formObj.find("textarea[name='tbl_contents']").val()){
							alert("내용을 입력하세요");
							return false;
						}
					
						e.preventDefault();
						console.log("submit clicked");
						var str = "";

						$(".uploadResult ul li").each(function(i, obj) {//i는 인덱스번호
								var jobj = $(obj);
								console.dir(jobj);

						//게시물 등록시 이미 업로드된 첨부파일들을 내부적으로 input태그로 만들어 form 태그가 submit될 때 같이 전송되도록 함
						str += "<input type='hidden' name='attachList["
							+ i+ "].fileName' value='"
							+ jobj.data("filename")+ "'>";
						str += "<input type='hidden' name='attachList["
							+ i+ "].uuid' value='"+ jobj.data("uuid")+ "'>";
						str += "<input type='hidden' name='attachList["
							+ i+ "].uploadPath' value='"+ jobj.data("path")+ "'>";
						str += "<input type='hidden' name='attachList["
							+ i+ "].fileType' value='"+ jobj.data("type")+ "'>";
						});
						formObj.append(str).submit();
						});

						var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");
						var maxSize = 5242880;//5MB

						function checkExtension(fileName, fileSize) {

							if (fileSize >= maxSize) {
								alert("파일 사이즈 초과");
								return false;
							}
							if (regex.test(fileName)) {
								alert("해당 종류의 파일은 업로드할 수 없습니다.");
								return false;
							}
							return true;

						}

						$("input[type='file']").change(function(e) {
							var formData = new FormData();
							var inputFile = $("input[name='uploadFile']");
							var files = inputFile[0].files;
							for (var i = 0; i < files.length; i++) {

							if (!checkExtension(
												files[i].name,
												files[i].size)) {//확장자와 파일크기 체크
								return false;
							}

							formData.append("uploadFile",files[i]);
							}

							$.ajax({
									url : '/uploadAjaxAction',
									processData : false,
									contentType : false,
									beforeSend : function(xhr) {
									xhr.setRequestHeader(
															csrfHeaderName,
															csrfTokenValue);
									},
									data : formData, //ajax를 통해 formData 자체를 전송
									type : 'POST',
									dataType : 'json',
									success : function(result) {
									console.log(result);

									showUploadResult(result); //업로드 결과 처리 함수
									}

									}); //$.ajax

						});

						function showUploadResult(uploadResultArr) {

							if (!uploadResultArr || uploadResultArr.length == 0) {
								return;
							}

							var uploadUL = $(".uploadResult ul");

							var str = "";

							$(uploadResultArr).each(function(i, obj) {

								//image type check
								if (!obj.image) { //이미지가 아니면 첨부파일 이미지 붙이기 

									var fileCallPath = encodeURIComponent(obj.uploadPath
														+ "/"
															+ obj.uuid
															+ "_"
															+ obj.fileName);

													var fileLink = fileCallPath
															.replace(
																	new RegExp(
																			/\\/g),
																	"/");
													//var regExp = /정규표현식/[Flag]; 
													//Flag g:global- 문자열의 모든 패턴을 찾음
													//Flag i:Ignore Case - 문자열의 대소문자구분x
													//Flag m:Multi line -문자열의 행이 바뀌어도 찾음		

													str += "<li ";
					str+="data-path='"+obj.uploadPath+"' data-uuid='"+obj.uuid+"' data-filename='"
							+obj.fileName+"'data-type='"+obj.image+"'><div>";

													str += "<span>"
															+ obj.fileName
															+ "</span>";
													str += "<button type='button' data-file=\'"
							+fileCallPath+"\' data-type='file' class='btn btn-warning btn-circle'><i class='fa fa-times'></i></button><br>";
													str += "<img src='/resources/img/attach.png'></a>";
													str += "</div></li>";

												} else {

													var fileCallPath = encodeURIComponent(obj.uploadPath
															+ "/s_"
															+ obj.uuid
															+ "_"
															+ obj.fileName);

													str += "<li ";
					str+="data-path='"+obj.uploadPath+"' data-uuid='"+obj.uuid+"' data-filename='"
							+obj.fileName+"'data-type='"+obj.image+"'><div>";
													str += "<span>"
															+ obj.fileName
															+ "</span>";
													str += "<button type='button' data-file=\'"+fileCallPath+"\' ";
					str+="data-type='image' class='btn btn-warning btn-circle'><i class='fa fa-times'></i></button><br>";
													str += "<img src='/display?fileName="
															+ fileCallPath
															+ "'>";
													str += "</div></li>";

												}
											});
							uploadUL.append(str);

						}
					});
</script>
<style type="text/css">
.uploadResult {
	width: 100%;
	background-color: gray;
}

.uploadResult ul {
	display: flex;
	flex-flow: row;
	justify-content: center;
	align-items: center;
}

.uploadResult ul li {
	list-style: none;
	padding: 10px;
	align-content: center;
	text-align: center;
}

.uploadResult ul li img {
	width: 100px;
}

.uploadResult ul li span {
	color: white;
}

.bigPictureWrapper {
	position: absolute;
	display: none;
	justify-content: center;
	align-items: center;
	top: 0%;
	width: 100%;
	height: 100%;
	background-color: gray;
	z-index: 100;
	background: rgba(255, 255, 255, 0.5);
}

.bigPicture {
	position: relative;
	display: flex;
	justify-content: center;
	align-items: center;
}

.bigPicture img {
	width: 600px;
}
</style>
<%@include file="../includes/index_footer.jsp"%>
<%-- <%@include file="../includes/footer.jsp"%> --%>