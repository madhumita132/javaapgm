package jspemployee;

import java.sql.*;

public class AccountInsertClass
{
	public static void main(String args[])
	{
		String  accountid;
		String accountholdername;
		int balance;
		String last_transaction_date;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/karthik", "root", "root");
			Statement stmt = con.createStatement();
			
			// Inserting data in database
			String q1 = "insert into userid values(" +accountid+ ", '" +accountholdername+
								"', '" +balance+ "', '" +last_transaction_date+ "')";
			int x = stmt.executeUpdate(q1);
			if (x > 0)		
				System.out.println("Successfully Inserted");		
			else		
				System.out.println("Insert Failed");
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
