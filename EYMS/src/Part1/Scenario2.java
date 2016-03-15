package Part1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Scenario /Register a user/
 * @author kewenjing
 *
 */

public class Scenario2 {
	public static void main(String [] args){
		registerUser("test2input.txt","test2output.txt");
	}
	
	public static void registerUser(String inputText,String outputText){
		String line="";
		try
        {
                BufferedReader in=new BufferedReader(new FileReader(inputText));
                line=in.readLine();
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
	}
}
