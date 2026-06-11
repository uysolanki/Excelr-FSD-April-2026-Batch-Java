package day14;

public class MultiThreadDemo {

	public static void main(String[] args) {
		Alpha thread1=new Alpha("Alpha");
		Beta thread2=new Beta("Bravo");
		Gama thread3=new Gama("Charlie");
		
		thread1.start();	//Thread-0
		thread2.start();	//Thread-1
		thread3.start();	//Thread-2
		
//		System.out.println(Thread.currentThread().getName());
//		for(int i=3001;i<=4000;i++)			//2nd for loop will start after completion of 1st for loop
//			System.out.println("\t\t\t"+i);

	}

}
