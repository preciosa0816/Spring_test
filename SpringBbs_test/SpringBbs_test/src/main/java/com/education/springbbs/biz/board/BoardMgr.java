package com.education.springbbs.biz.board;

import java.util.List;

import com.education.springbbs.dto.board.BoardDto;

public interface BoardMgr {
	
	
	
	/**
	 * 글보기
	 * @param seq
	 * @return
	 * @throws Exception
	 */
	public BoardDto getBbsView(int seq) throws Exception;
	
	List<BoardDto> getBbsList(int startNum, int endNum, String searchKey,String searchValue) throws Exception;
	int boardCount(String searchKey, String searchValue) throws Exception;
	public String sysDate() throws Exception;
}
