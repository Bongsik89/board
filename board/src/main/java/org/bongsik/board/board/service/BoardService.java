package org.bongsik.board.board.service;

import java.util.List;

import org.bongsik.board.board.model.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList() throws Exception;
	
	public void insertBoard(BoardVO boardVO) throws Exception;
	
	public BoardVO getBoardContent(int bid) throws Exception;
	
	public int updateBoard(BoardVO boardVO) throws Exception;
	
	public void deleteBoard(int bid) throws Exception;

}
