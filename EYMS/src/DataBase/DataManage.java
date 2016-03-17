package DataBase;

import java.io.IOException;

import User.User;

public abstract class DataManage {
	public void addUser(User user){
		String filePath="/Users/kewenjing/Desktop/EYMS/";
		String fileName=user.getUsername();
		try {
            /**
             *  Serializing the object
             */
            Serializer.serialize(user, filePath+fileName+".txt");
 
            /**
             * Deserializing the object
             */
            User newUser = (User) Serializer.deserialize(filePath+fileName+".txt");
            
            System.out.println(newUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

	}
	
}
