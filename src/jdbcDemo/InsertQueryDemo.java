package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQueryDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String title = "Finding deminmo";
		String genre = "Comedy";
		String director = "puri Stanton ";
		String release_year = "2013";
		
		
		
Class.forName("com.mysql.cj.jdbc.Driver");
String dburl = "jdbc:mysql://localhost:3306/animated_movies";
String username = "root";
String password = "root";
		Connection con = DriverManager.getConnection(dburl,username,password);
		
		PreparedStatement ps = con.prepareStatement("insert into movies values(?,?,?,?)"); // execute query
		ps.setString(1,title);
		ps.setString(2,genre);
		ps.setString(3,director);
		ps.setString(4,release_year);
		
		ps.executeUpdate();
		// see the result
		
		con.close();

	}

}
