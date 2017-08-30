package project;

import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import gui.Title;

public class Main {
	static Connection conn = null;
	public static void main(String[] args) throws SQLException, MalformedURLException{

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "1234");
		new Title("대한민국 여기저기","" ,0 , 1, "서울", 0, "경", conn);
	}
}
