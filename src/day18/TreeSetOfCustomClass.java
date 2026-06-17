package day18;

import java.util.TreeSet;

public class TreeSetOfCustomClass {

	public static void main(String[] args) {
		
		Student s1=new Student(18,"Virat",99.5);
		Student s2=new Student(45,"Rohit",88.5);
		Student s3=new Student(1,"Rahul",98.5);
		
		TreeSet<Student> fyStudentsAttendance=new TreeSet(new RnoComparator());	//compare by rno in ASC Order
		
		fyStudentsAttendance.add(s1);
		fyStudentsAttendance.add(s2);
		fyStudentsAttendance.add(s3);		//[[1,Rahul,98.5],[18,Virat,99.5][45,Rohit,88.5]
	
		System.out.println("***Attendance List***");
		System.out.println(fyStudentsAttendance);
		
		TreeSet<Student> fyStudentsExamSeating=new TreeSet(new NameComparator());	//compare by name in ASC Order
		fyStudentsExamSeating.add(s1);
		fyStudentsExamSeating.add(s2);
		fyStudentsExamSeating.add(s3);	
		System.out.println("***Exam Seating Order***");
		System.out.println(fyStudentsExamSeating);	//[[1,Rahul,98.5],[45,Rohit,88.5],[18,Virat,99.5]]
		
		
		TreeSet<Student> fyStudentsResultList=new TreeSet(new PerComparator());	//compare by name in ASC Order
		fyStudentsResultList.add(s1);
		fyStudentsResultList.add(s2);
		fyStudentsResultList.add(s3);
		System.out.println("***Results Published***");
		System.out.println(fyStudentsResultList); // [[18,Virat,99.5],[1,Rahul,98.5],[45,Rohit,88.5]]
	}

}

//Comparable
//Comparator