package mavenjdbcm8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementDeleteUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","root");
		
//		Create a Statement
		CallableStatement callableStatement=connection.prepareCall("call deleteUser(2001)");
		
		callableStatement.execute();
		connection.close();
		System.out.println("data deleted successfully with CS");
		
		
		
		
		
		
		
	}
}
