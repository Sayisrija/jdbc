package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//connection creation
			Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
			//create statement
			Statement mystmt=mycon.createStatement();
			ResultSet rs=mystmt.executeQuery("SELECT * FROM mydatabase.employee");
			while(rs.next())
			{
				System.out.println(rs.getNString("name")+" "+rs.getNString("role"));
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
