package wenjing.lucas.Part1.EYMS.src.Part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ClientVerication implements Verification {

	@Override
	public Boolean verify(String user_name, String password) {
		// TODO Auto-generated method stub
		String username_corr="";
		String password_corr="";
		
		String fileName="c:/kuka.txt";
        String line="";
        try
        {
                BufferedReader in=new BufferedReader(new FileReader(fileName));
                line=in.readLine();
                String[] user_info=line.split(";");
                		
                		
                		
                while (line!=null)
                {
                        System.out.println(line);
                        line=in.readLine();
                }
                in.close();
        } catch (IOException e)
        {
                e.printStackTrace();
        }
        if(username_corr.equals(user_name)){
        	
        }
        if(password_corr.equals(password)){
        	return true;
        }
        else{
        	System.out.println("Your username and password didn't match. Please try again.");
        	return false;
        }
        
        
        
	}

}
