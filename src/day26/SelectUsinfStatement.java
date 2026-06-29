package day26;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import day25.ExcelRMySQLConnection;

public class SelectUsinfStatement {
public static void main(String[] args) throws Exception
{
	
	//display name and salary of employee earning more than 1500
	
	//Connection connection=ExcelRHikariDatabaseConnectionPool.getDataSource().getConnection();
	Connection connection = ExcelRMySQLConnection.getConnection();
	Statement st=connection.createStatement();
	//String query="select ename,sal from emp where eno=1";
	//String query="select ename,sal from emp where sal>=1500 ";
	String query="select sal,ename from emp where sal>=1500 ";
	
	ResultSet rs=st.executeQuery(query); //before first
	
	while(rs.next())
//		System.out.println(rs.getString(1) + " "+ rs.getDouble(2));
		System.out.println(rs.getString("ename") + " "+ rs.getDouble("sal"));
	
	rs.close();
	st.close();
	connection.close();
}
}
