package org.zerock.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller // Controller=Servlet(JSP) //Controller:Spring MVC 컨트롤러 객체임을 명시
@RequestMapping("/sample/*") // RequestMapping(): 특정 URI에 매칭되는 클래스나 매소드임을 명시하는 어노테이션
@Log4j
public class SampleController {

	@RequestMapping("")
	public void basic() {
		log.info("basic.............................................");
	}

	// get,post 방식 모두를 지원해얗나느 경우에 배열로 처리해서 지정 가능
	@RequestMapping(value = "/basic", method = { RequestMethod.GET, RequestMethod.POST })
	public void basic2() {
		log.info("just_basic.............................................");
	}

	// get방식만 가능
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basicGet.............................................");
	}

	// http://localhost:8080/controller/sample/ex01?name=AAA&age=10 검색시
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("" + dto);// INFO : org.zerock.controller.SampleController - SampleDTO(name=AAA, age=10)
		return "ex01";
	}

	// 파라미터의 수집과 변환
	// @RequestParam("name"):request에서 특정 파라미터의 값을 찾아낼 때 사용하는 @(annotation)
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		// String age= request.getParamete("age");
		// int age2=Integer.parseInt(age); 이를 간단하게 표현 가능

		log.info("name: " + name);
		log.info("age: " + age);
		return "ex02";

	}

	// 리스트, 배열 처리
	@GetMapping("/ex02List")//http://localhost:8080/sample/ex02List?ids=111&ids=222&ids=333
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ids: " + ids);//INFO : org.zerock.controller.SampleController - ids: [111, 222, 333]
		return "ex02List";
	}
	
	@GetMapping("/ex02Array") //http://localhost:8080/sample/ex02Array?ids=111&ids=222&ids=333
	public String ex02Array(@RequestParam("ids") String[] ids) {
		log.info("array ids: " + Arrays.toString(ids));//INFO : org.zerock.controller.SampleController - array ids: [111, 222, 333]
		return "ex02Array";
	}

	
	//객체 리스트 : sampleDTO처럼 객체타입이고 여러개를 처리해야하는 경우 한번에 처리하기(SampleDTOList클래스 이용)	
	@GetMapping("/ex02Bean")//http://localhost:8080/sample/ex02Bean?list%5B0%5D.name=aaaa&list%5B1%5D.name=bbb
	public String ex02Bean(SampleDTOList list) {//list%5B0%5D.name =>list[0].name
		log.info("list dtos: "+list); 
		//INFO : org.zerock.controller.SampleController - list dtos: 
		//			SampleDTOList(list=[SampleDTO(name=aaaa, age=0), SampleDTO(name=bbb, age=0)])
		
		return "ex02Bean";
	}
	
	
	//@InitBinder: 파라미터의 수집(binding). 스프링 컨트롤러에서 파라미터를 바인딩할 경우 자동호출을 통해서 변환처리
	//				예) 화면에서 '2019-11-1' 전달된 데이터를 java.util.Date 타입 변환시
	
	//방법1
//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
//	}
	
	@GetMapping("/ex03")			  //http://localhost:8080/sample/ex03?title=test&dueDate=2018-01-01(방법1)
	public String ex03(TodoDTO todo) {//http://localhost:8080/sample/ex03?title=test&dueDate=2018/01/01(방법2)
		log.info("todo: "+todo);
		return "ex03";
	}
	
	//140
	//@ModelAttribute 사용하지 않을 때
	@GetMapping("/ex04")			  //http://localhost:8080/sample/ex04?name=aaa&age=11&page=9
	public String ex04(SampleDTO dto, int page) {
		//SampleDTO dto가 내부적으로 객체가 생성되어 ex04.jsp에서 ${sampleDTO}가 받게됨.		
		log.info("dto: "+dto); 
		log.info("page: "+page); //int타입으로 선언된 page는 전달되지 않음.
		//INFO : org.zerock.controller.SampleController - dto: SampleDTO(name=aaa, age=11)
		//INFO : org.zerock.controller.SampleController - page: 9 
		return "/sample/ex04";
	}
	
	//140
	//String Type(반환타입)
	//@ModelAttribute:강제로 전달받은 파라미터를 Model에 담아서 전달하도록 할 때 필요한 어노테이션. 타입에 관계없이 무조건 Model에 담아서 전달.
	//				  파라미터로 전달된 데이터를 다시 화면에서 사용해야할 경우 유용하게 사용됨.
	@GetMapping("/ex044")			  //http://localhost:8080/sample/ex044?name=aaa&age=11&page=9
	public String ex044(SampleDTO dto, @ModelAttribute("page") int page) {
		//SampleDTO dto가 내부적으로 객체가 생성되어 ex04.jsp에서 ${sampleDTO}가 받게됨.		
		log.info("dto: "+dto); 
		log.info("page: "+page); //int타입으로 선언된 page는 전달되지 않음.
		//INFO : org.zerock.controller.SampleController - dto: SampleDTO(name=aaa, age=11)
		//INFO : org.zerock.controller.SampleController - page: 9 
		return "/sample/ex04";
	}
	
	//144
	//void type
	//return type이 void인 경우: URL과 동일한 이름의 jsp 의미:http://localhost:8080/sample/ex05
	//						:return 이 없음에도 기본경로(http://localhost:8080)에 sample/ex05.jsp찾아서 실행
	@GetMapping("/ex05")
	public void ex05() {
		log.info("ex05............");
		
	}
	
	//@ResponseBody: 리턴 타입이 http의 응답메시지로 전송. 메소드나 파라미터로 사용 //pom.xml에 jackson-databind를 붙여놔야함.
	//				Spribg mvc는 자동으로 브라우저의 JSON타입으로 객체를 변환해서 전달.
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() { //http://localhost:8080/sample/ex06
		log.info("/ex06...........");
		SampleDTO dto=new SampleDTO();
		dto.setAge(10);
		dto.setName("hong");
		return dto;//{"name":"hong","age":10} : 자동으로 JSON 타이븡로 객체변환하여 전달./ ex06.jsp존재x
	}
	
	//148
	//@ResponseEntity : header+data를 view에 전달
	@GetMapping("/ex07")
	public ResponseEntity<String> ex07(){//http://localhost:8080/sample/ex07
		log.info("/ex07.....");
		
		//{"name":"hong"}
		String msg="{\"name\":\"hong\"}";
		
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		//JSON타입이라는 header 메시지와 200OK라는 상태코드 전송
		return new ResponseEntity<>(msg,header,HttpStatus.OK); //{"name":"hong"} 
	}
	
	
	//150
	//fileUpload Get방식
	@GetMapping("/exUpload")
	public void exUpload() {//http://localhost:8080/sample/exUpload
		log.info("/exUpload.............");
	}
	
	
	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {	
		files.forEach(file->{
			log.info("--------------------");
			log.info("name:" +file.getOriginalFilename());
			log.info("size:"+file.getSize());
		});
	}
	
}














