package Part1;

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
	            String[] info=newClient.toString().split("[;]+");
	            System.out.println(newClient);
	            System.out.println(info[1]);
	 
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }

	}

}
