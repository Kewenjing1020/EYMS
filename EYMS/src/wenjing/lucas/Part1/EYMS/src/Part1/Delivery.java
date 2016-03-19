package wenjing.lucas.Part1.EYMS.src.Part1;

import java.util.Arrays;

import Restaurant.Order;

public class Delivery {
	private Order order;
	private Client client;
	private String contactname;
	private String phonenumber;
	private String adress;
	private String[] delivery_info;
	/**
	 * @param order
	 * @param client
	 * @param contactname
	 * @param phonenumber
	 * @param adress
	 * @param delivery_info
	 */
	public Delivery(Order order, Client client, String contactname, String phonenumber, String adress) {
		super();
		this.order = order;
		this.client = client;
		this.contactname = contactname;
		this.phonenumber = phonenumber;
		this.adress = adress;
		this.delivery_info = new String[3];
	}
	
	
	
	@Override
	public String toString() {
		return "Delivery [order=" + order + ", client=" + client.getFirst_name()+" "+client.getLast_name() + ", delivery_info=" + Arrays.toString(delivery_info)
				+ "]";
	}



	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String[] getDelivery_info() {
		return delivery_info;
	}
	public void setDelivery_info(String[] delivery_info) {
		this.delivery_info[0]=this.contactname ;
		this.delivery_info[1]=this.phonenumber ;
		this.delivery_info[2]=this.adress;
	}
	
	
	
	
	
	
}
