package DataBase;

import java.io.IOException;
import java.util.ArrayList;

import Part1.Client;

/**
 * public static ArrayList<Client> Load_ClientData();
 * public static ArrayList<Client> Log_ClientData(ArrayList<Client> clients);
 * public static Boolean verify(ArrayList<Client> All_clients, String username);
 * public static Client Login(ArrayList<Client> All_clients, String username, String password);
 * public static void print_favoriteMeals(Client client);
 * public static ArrayList<Client> refresh_clientdata(Client client, ArrayList<Client> All_clients);
 * @author kewenjing
 *
 */
public class DataClient{
		
	public static String filePath="/Users/kewenjing/Desktop/EYMS/";
	
	public static void main(String [] args){
		ArrayList<Client> clients=new ArrayList<Client>();
		clients.add(new Client("emma","12345"));
		clients.add(new Client("lily","34567"));
		Log_ClientData(clients);
		ArrayList<Client> clients2=new ArrayList<Client>();
		clients2=Load_ClientData();
		Client emma=clients2.get(0);
		System.out.println(emma.getPassword());
		emma=Login(clients,"emma","12345");
		System.out.println(emma);
		emma.add_phone_number("680962887");
		//System.out.println(emma);
		clients=refresh_Data(emma, clients);
		System.out.println(clients);
	}
	
	
	
	/**
	 * open the client database, load the All_client info, before all the operation
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static ArrayList<Client> Load_ClientData(){
		ArrayList<Client> clients=new ArrayList<Client>();
		//open the file, deserialize the client_data
		try {
   
            /**
             * Deserializing the object
             */
            clients = (ArrayList<Client>) Serializer.deserialize(filePath+"Client_database.txt");
            System.out.println("succed in loading the new Al_client database");
            System.out.println(clients);
          
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("error: fail to load the All_clients data");
        }
		return clients;
	}
	
	
	/**
	 * after all the operation
	 * rewrite the All_client information into database
	 * @param clients
	 * @return
	 */
	public static ArrayList<Client> Log_ClientData(ArrayList<Client> clients){
		//open the file, serialize the client_data
		try {
            /**
             *  Serializing the object
             */
            Serializer.serialize(clients, filePath+"Client_database.txt");
            System.out.println("succed in loging the new Al_client database");
            System.out.println(clients);
          
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error: fail to log the new All_clients database");
        }
		return clients;
	}
	
	
	
	/**
	 * to make sure the username is unique
	 * trasverse all the client.getusername
	 * @param username
	 */
	public static Boolean verify(ArrayList<Client> All_clients, String username){
		for(int i=0; i<All_clients.size();i++ ){
			Client client=(Client)All_clients.get(i);
			if(client.getUser_name().equals(username)){
				System.out.println("this username is already used.");
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * Register a new user
	 * Add this user in the database
	 * @param All_clients
	 * @param newclient
	 * @return
	 */
	public static ArrayList<Client> Register(ArrayList<Client> All_clients, Client newclient){
		All_clients.add(newclient);
		return All_clients;
		
	}

	
	
	/**
	 * traverse the All_clients,  to find this client
	 * get this client's information
	 * @param username
	 * @param password
	 * @return
	 */
	
	public static Client Login(ArrayList<Client> All_clients, String username, String password) {
		for(int i=0; i<All_clients.size();i++ ){
			Client client=(Client)All_clients.get(i);
			while(client.getUser_name().equals(username) && client.getPassword().equals(password)){
				System.out.println("Welcome back!"+username);
				return client;
			}
		}
		System.out.println("error:cannot find the client");
		return null;
	}
	
	
	
	/**
	 * print this client's favorite meals
	 * @param client
	 */
	public static void print_favoriteMeals(Client client){
		System.out.println(client.getFavorite_meals());
	}
	
	
	
	/**
	 * refresh client_data in Arraylist All_clients
	 * refresh his <favorite_meals, address, phone, ...>
	 * @param client
	 * @param All_clients
	 * @return
	 */
	public static ArrayList<Client> refresh_Data(Client client, ArrayList<Client> All_clients){
		for(int i=0; i<All_clients.size();i++ ){
			Client client_old=(Client)All_clients.get(i);
			while(client.getUser_name().equals(client_old.getUser_name())){
				
				All_clients.set(i, client);
				
//				client_old.setAddress(client.getAddress());
//				client_old.setEmail(client.getEmail());
//				client_old.setPhone_number(client.getPhone_number());
//				client_old.setFavorite_meals(client.getFavorite_meals());
//				client_old.setContacter_names(client.getContacter_names());
				System.out.println("succed in load client's new info");
				return All_clients;
			}
		}
		System.out.println("fail in load client's new info");
		return All_clients;
	}

}
