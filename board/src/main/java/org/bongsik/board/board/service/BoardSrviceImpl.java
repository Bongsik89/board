package org.bongsik.board.board.service;

import java.util.List;

import javax.inject.Inject;

import org.bongsik.board.board.dao.BoardDAO;
import org.bongsik.board.board.model.BoardVO;
import org.bongsik.board.common.Pagination;
import org.bongsik.board.common.Search;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BoardSrviceImpl implements BoardService{
	
	@Inject
	BoardDAO boardDAO;

	@Override
	public List<BoardVO> getBoardList(Search search) throws Exception {
		return boardDAO.getBoardList(search);
	}

	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		boardDAO.insertBoard(boardVO);		
	}
	
	@Transactional
	@Override
	public BoardVO getBoardContent(int bid) throws Exception {
		//BoardVO boardVO = new BoardVO();
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

	@Override
	public int getBoardListCnt(Search search) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.getBoardListCnt(search);
	}
	
	

}
