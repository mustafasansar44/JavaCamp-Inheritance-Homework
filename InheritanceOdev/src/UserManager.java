
public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getFirstName() + " Adl� ki�i okula kaydoldu.");
	}
	public void deleteUser(User user) {
		System.out.println(user.getFirstName() + " Adl� ki�inin okul kayd� silindi.");
	}
}
