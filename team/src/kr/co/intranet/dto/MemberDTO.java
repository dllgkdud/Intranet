package kr.co.intranet.dto;

public class MemberDTO {
	private int empno;
    private String email;
    private String pw;
    private String ename;
    private String dept;
    private String pos;
    private String birth;
    private String empdate;
    
    
    public MemberDTO() {}
	public MemberDTO(int empno, String email, String pw, String ename,
			String dept, String pos, String birth, String empdate) {
		super();
		this.empno = empno;
		this.email = email;
		this.pw = pw;
		this.ename = ename;
		this.dept = dept;
		this.pos = pos;
		this.birth = birth;
		this.empdate = empdate;
	}
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmpdate() {
		return empdate;
	}
	public void setEmpdate(String empdate) {
		this.empdate = empdate;
	}
}
