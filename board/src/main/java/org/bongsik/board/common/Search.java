package org.bongsik.board.common;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode (callSuper = false)
public class Search extends Pagination{
	
	private String searchType;
	private String keyword;

}
