package jspemployee;

import java.sql.*;

public class AccountselectClass
{
	public static void main(String args[])
	{
		String accountid;
		String accountholdername;
		int balance;
		String last_transaction_date;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/product", "root", "madhu");
			Statement stmt = con.createStatement();
			
			// SELECT query
			String q1 = "select * from Account WHERE accountid = '" +accountid +
									"' AND accountholdername = '" +accountholdername + "'" + "' AND balance = '" +balance + "'"+
									"' AND last_transaction_date = '" +last_transaction_date + "'";;
			ResultSet rs = stmt.executeQuery(q1);
			if (rs.next())
			{
				System.out.println("accountid : " + rs.getString(1));
				System.out.println("accountholdername :" + rs.getString(2));
				System.out.println("balance:" + rs.getString(3));
				System.out.println("last_transaction_date:" + rs.getString(4));
			}
			else
			{
				System.out.println("No such Account id is already registered");
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}