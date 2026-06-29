package day26;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import day25.ExcelRMySQLConnection;

public class SelectUsingPreparedStatement {

	public static void main(String[] args) throws Exception
	{
		// accept eno and increment the salary of that employee by 500
		Connection con = ExcelRMySQLConnection.getConnection();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee number");
		int a=sc.nextInt();
		
		
		String query="select ename,sal from emp where eno=?";
		
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, a);
		
		
		ResultSet rs=ps.executeQuery(); 
		
		if(rs.next())
			System.out.println(rs.getString("ename") + " "+ rs.getDouble("sal"));
		
		rs.close();
		ps.close();
		con.close();

	}

}
