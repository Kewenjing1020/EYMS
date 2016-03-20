package User;

public class Personnel extends User implements Runnable{
	
	public Personnel(String username, String password) {
		super(username, password);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Attributes
	 */
	//All members of Personnel can't modify the meals
	private Boolean authorization_to_modify_meal;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
