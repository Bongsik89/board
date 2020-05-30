package org.bongsik.board.board.service;

import java.util.List;

import org.bongsik.board.board.model.BoardVO;
import org.bongsik.board.board.model.ReplyVO;
import org.bongsik.board.common.Pagination;
import org.bongsik.board.common.Search;

public interface BoardService {
	
	public List<BoardVO> getBoardList(Search search) throws Exception;
	
	public void insertBoard(BoardVO boardVO) throws Exception;
	
	public BoardVO getBoardContent(int bid) throws Exception;
	
	public int updateBoard(BoardVO boardVO) throws Exception;
	
	public void deleteBoard(int bid) throws Exception;
	
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
