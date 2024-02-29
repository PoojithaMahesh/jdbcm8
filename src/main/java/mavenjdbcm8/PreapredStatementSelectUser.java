package mavenjdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreapredStatementSelectUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","root");
//	Create a Statement
	PreparedStatement preparedStatement=connection.prepareStatement("Select * from User");
	
//	execute a query
	ResultSet resultSet=preparedStatement.executeQuery();
	
	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
	}
	
	connection.close();
	System.out.println("Data selected2 successfully with PS");
}
}
