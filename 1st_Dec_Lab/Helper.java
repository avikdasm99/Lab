package lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
	//register mysql driver
		static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		//connection mysql driver
		public static Connection con()throws SQLException{
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1", "root", "root");
		}
}