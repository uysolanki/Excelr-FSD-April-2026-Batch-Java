package day7;

import java.util.Scanner;

public class Student 
{

	private int rno;						//instance scope		this is prefixed to the instance scope var
	private String sname;					//instance scope
	private double per;						//instance scope
	private boolean outStationCandidate;  	//instance scope
	static int strength=0;
	
	
	public Student() {}
	public Student(int rno, String sname, double per, boolean outStationCandidate) 
	{
		this.rno = rno;
		this.sname = sname;
		this.per = per;
		this.outStationCandidate = outStationCandidate;
		strength++;
	}

	public void acceptStudent()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll Number");
		this.rno = sc.nextInt();
		
		System.out.println("Enter Student Name");
		this.sname = sc.next();
		
		System.out.println("Enter Percentage");
		this.per = sc.nextDouble();
		
		this.outStationCandidate=false;
	}
	
	public void displayStudent()
	{
		System.out.println("Student Roll Number is "+this.rno);
		
		System.out.println("Student Roll Name is "+this.sname);
		
		System.out.println("Student Percentage is "+ this.per);
		
		System.out.println("Student Domicile is Out Station Candiate  "+this.outStationCandidate);
	
	}
	
	public static void displayStrength()
	{
		System.out.println("Total Number of Students in class is "+Student.strength);
	}
}


//golden q:why do we create a class?
//golden A:to create its objects?

//silver q:why do we create a object?
//silver A:to call methods of the class


