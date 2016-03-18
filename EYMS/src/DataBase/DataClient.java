package DataBase;

import java.io.IOException;
import java.util.ArrayList;

import wenjing.lucas.Part1.EYMS.src.Part1.Client;

public class DataClient{
		
	public static String filePath="/Users/kewenjing/Desktop/EYMS/";
	private ArrayList<Client> All_clients;
	
	
	
	/**
	 * load the client database, before all the operation
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Client> Load_ClientData(){
		ArrayList<Client> clients=new ArrayList<Client>();
		//open the file, deserialize the client_data
		try {
   
            /**
             * Deserializing the object
             */
            clients = (ArrayList<Client>) Serializer.deserialize(filePath+"Client_database.txt");
            
            System.out.println(clients);
          
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("error: fail to load the All_clients data");
        }
		return clients;
	}
	
	
	
	
	public ArrayList<Client> Log_ClientData(ArrayList<Client> clients){
		//open the file, serialize the client_data
		try {
            /**
             *  Serializing the object
             */
            Serializer.serialize(clients, filePath+"Client_database.txt");
            System.out.println("succed in loging the new Al_client database");
            /**
             * Deserializing the object
             */
//            Client newClient = (Client) Serializer.deserialize("cend"+".txt");
//            
//            System.out.println(newClient);
          
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
	public Boolean verify(ArrayList<Client> All_clients, String username){
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
	 * traverse the All_clients,  to find this client
	 * @param username
	 * @param password
	 * @return
	 */
	
	public Client Login(String username, String password) {
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
	public void print_favoriteMeals(Client client){
		System.out.println(client.getFavorite_meals());
	}
	
	
	
	/**
	 * refresh client_data in Arraylist All_clients
	 * refresh his <favorite_meals, address, phone, ...>
	 * @param client
	 * @param All_clients
	 * @return
	 */
	public ArrayList<Client> refresh_clientdata(Client client, ArrayList<Client> All_clients){
		for(int i=0; i<All_clients.size();i++ ){
			Client client_old=(Client)All_clients.get(i);
			while(client.getUser_name().equals(client_old.getUser_name()) && client.getPassword().equals(client_old.getPassword())){
				
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
