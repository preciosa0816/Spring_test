package com.education.springbbs.biz.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.education.springbbs.dao.board.BoardDaoTrx;
import com.education.springbbs.dto.board.BoardDto;

@Service
public class BoardMgrTrxImpl  implements BoardMgrTrx{

	@Autowired
	BoardDaoTrx boardDaoTrx;
	@Override
	public int write(BoardDto bean) throws Exception {
		// TODO Auto-generated method stub
		return boardDaoTrx.write(bean);
	}

	

	@Override
	public int update(BoardDto bean) throws Exception {
		
		return boardDaoTrx.update(bean);
	}

	@Override
	public int delete(int num, String password) throws Exception {
		
		return boardDaoTrx.delete(num,password);
	}
	
	@Override
	public int update_view(int seq) throws Exception {
		// TODO Auto-generated method stub
		return boardDaoTrx.updqte_view(seq);
	}
}
