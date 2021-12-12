package kr.co.dothome.library.service;

import java.util.List;

import kr.co.dothome.library.vo.BoardVO;

public interface BoardService {
	List<BoardVO> selectBoardList() throws Exception;
}
