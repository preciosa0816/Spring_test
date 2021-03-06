package org.zerock.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class ForumVO {
	
	private Long fno;
	private Long bno;
	private String bcatagory;
	private String pcatagory;
	private String title;
	private String tbl_contents;
	private String user_id;
	private Date regdate;
	private Date updateDate;
	private Long views;
	
	
	
	
	private int replyCnt;

	private List<ForumAttachVO> attachList; //첨부파일 처리 
}
