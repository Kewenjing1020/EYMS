package DataBase;

import java.io.IOException;

import wenjing.lucas.Part1.EYMS.src.Part1.Client;

public interface DataClient{
		
	public void writeUser(Client client);
	
	public void identification();
	
	public void Login() ;
	
	public void readUser(Client client);

}
