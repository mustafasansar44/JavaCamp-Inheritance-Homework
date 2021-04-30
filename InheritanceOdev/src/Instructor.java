
public class Instructor extends User{
	private String teacherBranch;
	private String salary;
	
	
	public Instructor(
			int id, String firstName, String lastName,
			String teacherBranch, String salary) {
		super(id, firstName, lastName);
		this.teacherBranch = teacherBranch;
		this.salary = salary;
	}
	
	public String getTeacherBranch() {
		return this.teacherBranch;
	}
	public void setTeacherBranch(String teacherBranch) {
		this.teacherBranch = teacherBranch;
	}
	public String getSalary() {
		return this.salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
