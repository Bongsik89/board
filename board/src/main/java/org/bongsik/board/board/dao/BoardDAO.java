package org.bongsik.board.board.dao;

import java.util.List;

import org.bongsik.board.board.model.BoardVO;
import org.bongsik.board.board.model.ReplyVO;
import org.bongsik.board.common.Search;

public interface BoardDAO {
	
	//게시판 리스트
	public List<BoardVO> getBoardList(Search search) throws Exception;
	
	//게시글 상세
	public BoardVO getBoardContent(int bid) throws Exception;
	
	//게시글 작성
	public int insertBoard(BoardVO boardVO) throws Exception;
	
	//게시글 수정
	public int updateBoard(BoardVO boardVO) throws Exception;
	
	//게시글 삭제
	public int deleteBoard(int bid) throws Exception;
	
	//게시글 조회수
	public int updateViewCnt(int bid) throws Exception;
	
	//총 게시글 개수 확인
	public int getBoardListCnt(Search search) throws Exception;
	
	//댓글 리스트
	public List<ReplyVO> getReplyList(int bid) throws Exception;
		
	//댓글 작성
	public int saveReply(ReplyVO replyVO) throws Exception;
		
	//댓글 수정
	public int updateReply(ReplyVO replyVO) throws Exception;
		
	//댓글 삭제
	public int deleteReply(int rid)throws Exception;	

}
