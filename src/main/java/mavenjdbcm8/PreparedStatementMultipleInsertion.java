package mavenjdbcm8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementMultipleInsertion {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm8","root","root");
//	Create a Statement
	PreparedStatement preparedStatement=connection.prepareStatement("insert into User values(?,?,?)");
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("how many entries that you want to save");
	int entires=scanner.nextInt();
	int i=0;
	while(entires>i) {
		System.out.println("Please enter the id");
		int id=scanner.nextInt();
		System.out.println("please enter the name");
		String name=scanner.next();
		System.out.println("please enter the address");
		String address=scanner.next();
		
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, address);
	
		preparedStatement.execute();
		i++;
	}
	
	connection.close();
	System.out.println("Multiple Data saved successfully");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
