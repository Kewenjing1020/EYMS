package DataBase;

import java.io.IOException;  
import User.*;


public class SerializerTest {

	public static void main(String[] args) {	
		
		Client client = new Client();
		client.setFirstName("ke");
		client.setLastName("wen");
		String username="cend";
		client.setUsername(username);
		
		try {
	            /**
	             *  Serializing the object
	             */
	            Serializer.serialize(client, username+".txt");
	 
	            /**
	             * Deserializing the object
	             */
	            Client newClient = (Client) Serializer.deserialize("cend"+".txt");
	            
	            System.out.println(newClient);
	          
	 
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }


	}

}
