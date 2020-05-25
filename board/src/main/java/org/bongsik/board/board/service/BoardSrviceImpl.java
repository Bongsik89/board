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
		// TODO Auto-generated method stub
		return boardDAO.getBoardList();
	}
	
	

}
