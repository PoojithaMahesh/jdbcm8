package mavenjdbcm8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementSaveUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","root");
		
//		Create a Statement
		CallableStatement callableStatement=connection.prepareCall("call saveUser(2001,'sedhu','tn')");
		
		callableStatement.execute();
		connection.close();
		System.out.println("data saved successfully with CS");
		
		
		
		
		
		
		
	}
}
