package wenjing.lucas.Part1.EYMS.src.Part1;

import java.io.IOException;

public class SerializerTest {

	public static void main(String[] args) {
		
		Client client=new Client();
		client.setFirst_name("ke");
		client.setLast_name("wen");
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
	            Client newClient = (Client) Serializer.deserialize(username+".txt");
	            
	            System.out.println(newClient);
	          
	 
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	}

}
