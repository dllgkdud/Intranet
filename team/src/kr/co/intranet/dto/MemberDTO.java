package kr.co.intranet.dto;

public class MemberDTO {
	private int empno;
    private String email;
    private String pw;
    private String ename;
    private int deptno;
    private String birth;
    private String empdate;
    
    
    public MemberDTO() {}
	public MemberDTO(int empno, String email, String pw, String ename,
			int deptno, String birth, String empdate) {
		super();
		this.empno = empno;
		this.email = email;
		this.pw = pw;
		this.ename = ename;
		this.deptno = deptno;
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
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
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
