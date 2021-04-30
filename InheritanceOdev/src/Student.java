
public class Student extends User{
	private String studentNumber;
	private String classNumber;
	private String classBranch;
	
	public Student(
			int id, String firstName, String lastName,
			String studentNumber,String classNumber,String classBranch) {
		
		super(id, firstName, lastName);
		this.studentNumber = studentNumber;
		this.classNumber = classNumber;
		this.classBranch = classBranch;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}
	public String getClassBranch() {
		return classBranch;
	}
	public void setClassBranch(String classBranch) {
		this.classBranch = classBranch;
	}

}
