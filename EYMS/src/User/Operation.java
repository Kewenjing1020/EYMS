package User;

public abstract class Operation {
	
	protected String fileName;
	
	public abstract void Login(User user);
	public abstract void Identification(User user);
	public abstract void addUser();
	public abstract void deleteUser();
	
}
