package board.dto;

import java.sql.Timestamp;

public class BoardDto {
	
	private String board_num;
	private String board_subject;
	private String board_content;
	private int board_readcount;
	private Timestamp board_date;
	private int board_ref; //게시글 그룹번호
	private int board_re_lev; //답변글 깊이
	private int board_re_seq; //답변글 순서
	
	
	
	public BoardDto() {
	}

	public BoardDto(String board_num, String board_subject, String board_content, int board_readcount,
			Timestamp board_date, int board_ref, int board_re_lev, int board_re_seq) {
		super();
		this.board_num = board_num;
		this.board_subject = board_subject;
		this.board_content = board_content;
		this.board_readcount = board_readcount;
		this.board_date = board_date;
		this.board_ref = board_ref;
		this.board_re_lev = board_re_lev;
		this.board_re_seq = board_re_seq;
	}
	
	public String getBoard_num() {
		return board_num;
	}
	public void setBoard_num(String board_num) {
		this.board_num = board_num;
	}
	public String getBoard_subject() {
		return board_subject;
	}
	public void setBoard_subject(String board_subject) {
		this.board_subject = board_subject;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public int getBoard_readcount() {
		return board_readcount;
	}
	public void setBoard_readcount(int board_readcount) {
		this.board_readcount = board_readcount;
	}
	public Timestamp getBoard_date() {
		return board_date;
	}
	public void setBoard_date(Timestamp board_date) {
		this.board_date = board_date;
	}
	public int getBoard_ref() {
		return board_ref;
	}
	public void setBoard_ref(int board_ref) {
		this.board_ref = board_ref;
	}
	public int getBoard_re_lev() {
		return board_re_lev;
	}
	public void setBoard_re_lev(int board_re_lev) {
		this.board_re_lev = board_re_lev;
	}
	public int getBoard_re_seq() {
		return board_re_seq;
	}
	public void setBoard_re_seq(int board_re_seq) {
		this.board_re_seq = board_re_seq;
	}
	
	

}
