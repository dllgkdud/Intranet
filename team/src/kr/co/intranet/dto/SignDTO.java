package kr.co.intranet.dto;

public class SignDTO {
	//결재번호
	private int sno;
	//결재제목
	private String title;
	//결재내용
	private String content;
	//결재자
	private String sid;
	//결재상태(현황)
	private int state;
	//결재날짜
	private String regdate;
	
	//Getter&Setter
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
