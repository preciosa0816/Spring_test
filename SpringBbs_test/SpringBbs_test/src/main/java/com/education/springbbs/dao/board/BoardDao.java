package com.education.springbbs.dao.board;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.education.springbbs.dto.board.BoardDto;

@Repository
public class BoardDao {

	
	private static final Logger logger = LoggerFactory.getLogger(BoardDao.class);
	   @Autowired
	   private SqlSession sqlSession;
	    

		public List<BoardDto> getBbsList(int startNum, int endNum, String searchKey,String searchValue) throws SQLException,Exception {

			HashMap<String, String> object = new HashMap<String, String>();
			object.put("startNum", Integer.toString(startNum));
			object.put("endNum", Integer.toString(endNum));
			object.put("searchKey", searchKey);
			object.put("searchValue", searchValue);
			logger.debug("listDao===============>"+object);
			
			List<BoardDto> list = null;
			try {
				list = sqlSession.selectList("board.boardMaper.selectBoardList", object); 

			} catch (Exception e) {
				e.printStackTrace();
			}				
			return list;
		}

		public int boardCount(String searchKey, String searchValue) throws Exception {
			
			HashMap<String, String> object = new HashMap<String, String>();
			object.put("searchKey", searchKey);
			object.put("searchValue", searchValue);
			int result =0;
			
			try {

				result=sqlSession.selectOne("board.boardMaper.selectListCnt",object);

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return result;

		}
		
		
		public BoardDto getBbsView (int seq) throws SQLException,Exception{
			BoardDto bean = null;
			
			try {
				bean =sqlSession.selectOne("board.boardMaper.view", seq);
				//sqlSession.update("board.boardMaperTrx.update_view", seq);
			} catch (Exception e) {
				e.printStackTrace();
			}			
			return bean;

		}
}
