package com.education.springbbs.dao.board;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.education.springbbs.dto.board.BoardDto;

@Repository
public class BoardDaoTrx {

	private static final Logger logger = LoggerFactory.getLogger(BoardDaoTrx.class);
	@Autowired
	private SqlSession sqlSession;

	public int write(BoardDto bean) throws Exception {
		return sqlSession.insert("board.boardMapperTrx.write", bean);
	}

	public int update(BoardDto bean) throws Exception {
		return sqlSession.update("board.boardMapperTrx.update", bean);
	}

	public int updqte_view(int seq) throws Exception {
		return sqlSession.update("board.boardMapperTrx.update_view", seq);
	}

	public int delete(int num, String password) throws Exception {
		System.out.println("마지막 Trx 값 테스트 ==========="+num+"  "+password);
		HashMap<String, Object> param = new HashMap<String, Object>();
	
		param.put("a",Integer.toString(num));
		param.put("b",password);
		
		return sqlSession.delete("board.boardMapperTrx.delete", param);
	}

}
