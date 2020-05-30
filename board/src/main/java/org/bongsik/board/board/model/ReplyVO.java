package org.bongsik.board.board.model;

import lombok.Data;

@Data
public class ReplyVO {
	
	public int rid;
	public int bid;
	public String content;
	public String reg_id;
	public String reg_dt;
	public String edit_dt;	

}
