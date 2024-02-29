package mavenjdbcm8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatementFindUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","root");
		
//		Create a Statement
		CallableStatement callableStatement=connection.prepareCall("call findUser(2001)");
		
		ResultSet resultSet=callableStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
		}
		
		connection.close();
		System.out.println("data fetched successfully with CS");
		
		
		
		
		
		
		
	}
}
