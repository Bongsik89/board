package org.bongsik.board.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.bongsik.board.board.model.BoardVO;
import org.bongsik.board.board.model.ReplyVO;
import org.bongsik.board.common.Pagination;
import org.bongsik.board.common.Search;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private String Namespace = "org.bongsik.board.board.boardMapper";
	
	private String Namespace1 = "org.bongsik.board.board.replyMapper";
	
	//게시판 리스트
	@Override
	public List<BoardVO> getBoardList(Search search) throws Exception {		
		return sqlSession.selectList(Namespace+".getBoardList", search);
	}

	//게시글 상세
	@Override
	public BoardVO getBoardContent(int bid) throws Exception {		
		return sqlSession.selectOne(Namespace +".getBoardContent", bid);
	}

	//게시글 작성
	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {
		return sqlSession.insert(Namespace +".insertBoard", boardVO);
	}
	
	//게시글 수정
	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {		
		return sqlSession.update(Namespace +".updateBoard", boardVO);
	}
	
	//게시글 삭제
	@Override
	public int deleteBoard(int bid) throws Exception {		
		return sqlSession.delete(Namespace + ".deleteBoard", bid);
	}
	
	//게시글 조회수
	@Override
	public int updateViewCnt(int bid) throws Exception {		
		return sqlSession.update(Namespace + ".updateViewCnt", bid);
	}
	
	//총 게시글 개수 확인
	@Override
	public int getBoardListCnt(Search search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Namespace + ".getBoardListCnt", search);
	}
	

	
	//댓글리스트
	@Override
	public List<ReplyVO> getReplyList(int bid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(Namespace1 + ".getReplyList", bid);
	}
	
	//댓글작성
	@Override
	public int saveReply(ReplyVO replyVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(Namespace1 + ".saveReply", replyVO);
	}
	
	//댓글 수정
	@Override
	public int updateReply(ReplyVO replyVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(Namespace1 + ".updateReply", replyVO);
	}
	
	//댓글 삭제
	@Override
	public int deleteReply(int rid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(Namespace1 + ".deleteReply", rid);
	}
	
	
}
