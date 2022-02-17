package controller;

import java.util.Date;

public class BoardVo {
	
	private int num;
	private String title;
	private String writer;
	private String content;
	private Date date;
	private int cnt;
	
	
	public BoardVo() {}

	public BoardVo(int num, String title, String writer, String content, Date date, int cnt) {
		super();
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.date = date;
		this.cnt = cnt;
	}

	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return "BoardVo [num=" + num + ", title=" + title + ", writer=" + writer + ", content=" + content + ", date="
				+ date + ", cnt=" + cnt + "]";
	}
	

}
