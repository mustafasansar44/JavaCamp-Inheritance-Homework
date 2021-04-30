
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Mustafa", "Sansar", "1234", "11", "A");
		Student student2 = new Student(2, "Kemal", "Akalı", "2345", "11", "B");
		
		Instructor instructor1 = new Instructor(3, "Engin", "Demiroğ", "Yazılımcı", "5000");
		Instructor instructor2 = new Instructor(4, "Gürkan", "Özel", "Marangoz", "6000");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addGrade(student1);
		studentManager.addGrade(student2);
		
		System.out.println("--------------------------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.editSalary(instructor1);
		instructorManager.editSalary(instructor2);
		
		System.out.println("--------------------------------------------------------");
		
		UserManager userManager = new UserManager();
		userManager.addUser(student1);
		userManager.deleteUser(student2);
		userManager.addUser(instructor1);
		userManager.deleteUser(instructor2);
		

	}

}
