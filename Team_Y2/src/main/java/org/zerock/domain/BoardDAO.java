package org.zerock.domain;

import java.util.List;

public interface BoardDAO {
	List<BoardVO> selectBoardList() throws Exception;
}
