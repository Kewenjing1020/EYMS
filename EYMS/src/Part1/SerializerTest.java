package part1;

import java.io.IOException;

public class SerializerTest {

	public static void main(String[] args) {
		Client a=new Client();
		a.setUser_name("cend");
		a.setPassword("12345");
		a.setFirst_name("KE");
		a.setLast_name("wen");
		
		try {
            /**
             *  Serializing the object
             */
            Serializer.serialize(a, "serialization.txt");
 
            /**
             * Deserializing the object
             */
            Client newUser = (Client) Serializer.deserialize("serialization.txt");
            System.out.println(newUser.toString());
 
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
		
	}

}
