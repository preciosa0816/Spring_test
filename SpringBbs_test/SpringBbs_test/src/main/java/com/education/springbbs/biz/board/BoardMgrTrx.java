package com.education.springbbs.biz.board;

import com.education.springbbs.dto.board.BoardDto;

public interface BoardMgrTrx {
	
	int update(BoardDto bean) throws Exception;
	int delete(int num, String password) throws Exception;
	/**
	 * 글쓰기
	 * @param bean 파라메터 정보
	 * @return int
	 * @throws Exception
	 */
	public int write(BoardDto bean) throws Exception;
	
	public int update_view(int seq) throws Exception;

}
