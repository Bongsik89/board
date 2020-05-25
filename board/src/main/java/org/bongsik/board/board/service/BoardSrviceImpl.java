package org.bongsik.board.board.service;

import java.util.List;

import javax.inject.Inject;

import org.bongsik.board.board.dao.BoardDAO;
import org.bongsik.board.board.model.BoardVO;
import org.springframework.stereotype.Service;

@Service
public class BoardSrviceImpl implements BoardService{
	
	@Inject
	BoardDAO boardDAO;

	@Override
	public List<BoardVO> getBoardList() throws Exception {
		return boardDAO.getBoardList();
	}

	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		boardDAO.insertBoard(boardVO);		
	}

	@Override
	public BoardVO getBoardContent(int bid) throws Exception {
		boardDAO.updateViewCnt(bid);
		return boardDAO.getBoardContent(bid);
	}

	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {		
		return boardDAO.updateBoard(boardVO);
	}

	@Override
	public void deleteBoard(int bid) throws Exception {
		boardDAO.deleteBoard(bid);
		
	}
	
	

}
