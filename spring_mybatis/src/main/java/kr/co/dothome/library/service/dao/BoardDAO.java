package kr.co.dothome.library.service.dao;

import java.util.List;

import kr.co.dothome.library.vo.BoardVO;

public interface BoardDAO {
	List<BoardVO> selectBoardList() throws Exception;
}
