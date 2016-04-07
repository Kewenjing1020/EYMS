package User;


import java.util.ArrayList;   
import FidelityCard.*;
import Operation.LoginClient;
import Operation.Observer;
import Operation.RegisterClient;
import Restaurant.Meal;

/**
 * Client class which inherits from the class User
 * @author Lucas
 *
 */

public class Client extends User implements Observer{
	

	//private String user_name;
	//private String password;
	//private String first_name;
	//private String last_name;
	
	
	private static final long serialVersionUID = 1861962790473617015L;
	
	//I have suppressed the attribute point because it is include to fidelity card
	//furthermore all client doesn't have point, only those you have the PointFidelityCard
	//private int points;
	private Boolean authorization = false;
	private String birthday = " ";
	private FidelityCardVisitor fidelityCard;

	private ArrayList<String> contacter_names;
	private ArrayList<String> email = null;
	private ArrayList<String> phone_number = null;
	private ArrayList<String> address = null;
	private ArrayList<Meal> favorite_meals;
	
	
	/**
	 * getPrice method
	 * @param meal
	 * @return
	 */
	public Double getPrice(Meal meal){
		Double price = this.fidelityCard.getPriceVisit(meal);
		return price;
	}
	
	
	/**
	 * Update method allowing to receive special offers if authorization is true.
	 */
	@Override
	public void update(ArrayList<String> messages) {
		try{
			for(String message : messages){
				email.add(message);
			}
		}
		catch(NullPointerException e){
			System.out.println(this.getUsername() 
					+ "doesn't want to receive offer in his email.");
		}
		try{
			for(String message : messages){
				phone_number.add(message);
			}
		}
		catch(NullPointerException e){
			System.out.println(this.getUsername() 
					+ "doesn't want to receive offer in his phone.");
		}
		try{
			for(String message : messages){
				address.add(message);
			}
		}
		catch(NullPointerException e){
			System.out.println(this.getUsername() 
					+ "doesn't want to receive offer in his postbox.");
		}
	}
	
	
	/**
	 * toString method
	 */

	@Override
	public String toString() {
		return "Customer [user_name=" + user_name + ", password=" + password + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", fidelityCard=" + fidelityCard + ", email=" + email + ", phone_number="
				+ phone_number + ", address=" + address + ", favorite_meals=" + favorite_meals + "]";
	}



	/**
	 * 
	 */
	public Client() {
		super();
		this.authorization=false;
		this.login = new LoginClient();
		this.register = new RegisterClient();
		this.fidelityCard = new BasicFidelityCard();
	}



	/**
	 * @param user_name
	 * @param password
	 */
	public Client(String user_name,String password) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.email = new ArrayList<String>();
		this.phone_number = new ArrayList<String>();
		this.address = new ArrayList<String>();
		this.authorization=false;
		this.contacter_names=new ArrayList<String>();
		this.login = new LoginClient();
		this.register = new RegisterClient();
		this.fidelityCard = new BasicFidelityCard();
	}
	
	
	/**
	 * @param user_name
	 * @param password
	 * @param first_name
	 * @param last_name
	 */
	public Client(String user_name, String password, String first_name, String last_name) {
		super();
		this.user_name = user_name;
		this.password = password;
		this.first_name =first_name;
		this.last_name = last_name;
		this.email = new ArrayList<String>();
		this.phone_number = new ArrayList<String>();
		this.address = new ArrayList<String>();
		this.authorization=false;
		this.contacter_names=new ArrayList<String>();
		contacter_names.add(last_name+" "+first_name);
		this.login = new LoginClient();
		this.register = new RegisterClient();
		this.fidelityCard = new BasicFidelityCard();
		
	}
	
	/**
	 * 
	 * @param new_email
	 */
	public void add_email(String new_email){
		
		this.email.add(new_email);	
	}
	
	public void add_phone_number(String new_phone_number){
		this.phone_number.add(new_phone_number);
	}
	
	public void add_address(String new_address){
		this.address.add(new_address);
	}
	
	public void add_favorite_meal(Meal meal){
		this.favorite_meals.add(meal);
	}
	
	public ArrayList<String> getEmail() {
		return email;
	}
	public void setEmail(ArrayList<String> email) {
		this.email = email;
	}
	public ArrayList<String> getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(ArrayList<String> phone_number) {
		this.phone_number = phone_number;
	}
	public ArrayList<String> getAddress() {
		return address;
	}
	public void setAddress(ArrayList<String> address) {
		this.address = address;
	}
	

	public ArrayList<Meal> getFavorite_meals() {
		return favorite_meals;
	}


	public void setFavorite_meals(ArrayList<Meal> favorite_meals) {
		this.favorite_meals = favorite_meals;
	}
	
	public Boolean getAuthorization() {
		return authorization;
	}



	public void setAuthorization(Boolean authorization) {
		this.authorization = authorization;
	}

	
	public String getBirthday() {
		return birthday;
	}



	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}



	public ArrayList<String> getGuest_names() {
		return contacter_names;
	}



	public void setGuest_names(ArrayList<String> guest_names) {
		this.contacter_names = guest_names;
	}



	public ArrayList<String> getContacter_names() {
		return contacter_names;
	}



	public void setContacter_names(ArrayList<String> contacter_names) {
		this.contacter_names = contacter_names;
	}







	



	


	
	
}
