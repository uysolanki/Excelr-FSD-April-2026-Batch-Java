package day8;

public class InterfaceDriverApp {

	public static void main(String[] args) {
		Horse h1=new Horse();
		h1.eat();
		h1.sleep();
		h1.run();
		
		Animal h2=new Horse();
		h2.eat();
		h2.sleep();
		h2.run();
		
		
		Animal t1=new BengalTiger();
		Tiger t2=new BengalTiger();
		BengalTiger t3=new BengalTiger();
		
		t1.eat();
		t1.sleep();
		t1.run();
		

		t2.eat();
		t2.sleep();
		t2.run();
		

		t2.eat();
		t2.sleep();
		t2.run();
	}

}
