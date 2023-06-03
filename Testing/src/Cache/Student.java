package Cache;

public class Student {
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, String studentMobile, String studentMarks, String studentRoll) {
		super();
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.studentMarks = studentMarks;
		this.studentRoll = studentRoll;
	}
	private String studentName;
	private String studentMobile;
	private String studentMarks;
	private String studentRoll;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	public String getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(String studentMarks) {
		this.studentMarks = studentMarks;
	}
	public String getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(String studentRoll) {
		this.studentRoll = studentRoll;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentMobile=" + studentMobile + ", studentMarks="
				+ studentMarks + ", studentRoll=" + studentRoll + "]";
	}

}
