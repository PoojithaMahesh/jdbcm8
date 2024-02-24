package mavenjdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQUeryConcept {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
////		1.Load and Register the Driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
////		2.Establish the Connection
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","root");
////		3.Create a Statement
//		Statement statement=connection.createStatement();
////		4.Execute a query
//		statement.executeQuery("insert into user values(20,'poo','mysore')");
////		5.Close the connection
//		connection.close();
//		System.out.println("done");
		
////		Result=EXception
////		1.Load and Register the Driver
//		Class.forName("com.mysql.cj.jdbc.Driver");
////		2.Establish the Connection
//		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","root");
////		3.Create a Statement
//		Statement statement=connection.createStatement();
////		4.Execute a query
//		statement.executeQuery("update User set name='poojitha' where id=1");
////		5.Close the Connection
//		connection.close();
//		System.out.println("Data updated successfully");
		
		
//		1.Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
//		2.Establish the Connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","root");
//		3.Create a Statement
		Statement statement=connection.createStatement();
//		4.Execute a query
		statement.executeQuery("delete from User where id=1");
//		5.Close the Connection
		connection.close();
		System.out.println("Data deleted successfully");
		
		
		
		
		
		
	}
}
