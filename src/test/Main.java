package test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		Calendar before = Calendar.getInstance();

		HttpURLConnection connection;
		try {
			connection = (HttpURLConnection)new URL( "https://portal.estacio.br/" ).openConnection();
			connection.getResponseCode();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Calendar end = Calendar.getInstance();

		//read the content

		Calendar endContent = Calendar.getInstance();

		System.out.println( end.getTimeInMillis() - before.getTimeInMillis());
		System.out.println( endContent.getTimeInMillis() - end.getTimeInMillis());
		
	}

}
