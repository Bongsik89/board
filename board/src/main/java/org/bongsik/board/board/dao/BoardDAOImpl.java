package org.bongsik.board.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.bongsik.board.board.model.BoardVO;
import org.bongsik.board.common.Pagination;
import org.bongsik.board.common.Search;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Inject
	private SqlSession sqlSession;
	private String Namespace = "org.bongsik.board.board.boardMapper";

	@Override
	public List<BoardVO> getBoardList(Search search) throws Exception {		
		return sqlSession.selectList(Namespace+".getBoardList", search);
	}

	@Override
	public BoardVO getBoardContent(int bid) throws Exception {		
		return sqlSession.selectOne(Namespace +".getBoardContent", bid);
	}

	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {
		return sqlSession.insert(Namespace +".insertBoard", boardVO);
	}

	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {		
		return sqlSession.update(Namespace +".updateBoard", boardVO);
	}

	@Override
	public int deleteBoard(int bid) throws Exception {		
		return sqlSession.delete(Namespace + ".deleteBoard", bid);
	}

	@Override
	public int updateViewCnt(int bid) throws Exception {		
		return sqlSession.update(Namespace + ".updateViewCnt", bid);
	}

	@Override
	public int getBoardListCnt(Search search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Namespace + ".getBoardListCnt", search);
	}

}
