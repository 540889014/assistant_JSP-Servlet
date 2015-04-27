package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	private Connection con;
	private String url="jdbc:mysql://localhost:3306/test";
	public Connection getCon()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,"root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
