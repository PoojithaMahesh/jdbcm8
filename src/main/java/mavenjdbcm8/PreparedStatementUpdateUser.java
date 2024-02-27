package mavenjdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementUpdateUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","root");
//	Create a Statement
	PreparedStatement preparedStatement=connection.prepareStatement("update User set name=? where id=?");
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter the Id");
	int id=scanner.nextInt();
	System.out.println("please enter the name");
	String name=scanner.next();
	
	preparedStatement.setString(1, name);
	preparedStatement.setInt(2, id);

//	execute a query
	preparedStatement.execute();

	connection.close();
	System.out.println("Data updated successfully with PS");
}
}
