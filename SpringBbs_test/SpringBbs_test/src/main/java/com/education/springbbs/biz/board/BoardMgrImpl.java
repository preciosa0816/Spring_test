package com.education.springbbs.biz.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.springbbs.dao.board.BoardDao;
import com.education.springbbs.dto.board.BoardDto;


@Service
public class BoardMgrImpl implements BoardMgr {
	
	
	@Autowired
	BoardDao boardDao;
	
	@Override
	public BoardDto getBbsView(int seq) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.getBbsView(seq);
	}



	@Override
	public List<BoardDto> getBbsList(int startNum, int endNum, String searchKey, String searchValue) throws Exception {
		// TODO Auto-generated method stub
		
		return boardDao.getBbsList(startNum, endNum, searchKey, searchValue);
	}

	@Override
	public int boardCount(String searchKey, String searchValue) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.boardCount(searchKey, searchValue);
	}

	@Override
	public String sysDate() throws Exception {
		// TODO Auto-generated method stub
		return "111111111";
	}

	
	
	
}
