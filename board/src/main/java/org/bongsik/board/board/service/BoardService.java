package org.bongsik.board.board.service;

import java.util.List;

import org.bongsik.board.board.model.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList() throws Exception;

}
