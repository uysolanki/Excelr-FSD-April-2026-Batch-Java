package day27;

public class HasADriver {

	public static void main(String[] args) {
		Engine eng1=new Engine(2000, 2.0, "Honda", "Petrol");	//programmer is creating the objects using "new"
		Engine eng2=new Engine(2500, 2.5, "Toyota", "Diesel");
		
		
		Gear gear1=new Gear(6, "Honda", "Manual");
		Gear gear2=new Gear(8, "Tata", "Automatic");
		
		
		Car car1=new Car("Honda","City", "White", 100.0, eng1, gear1);  //CDI
		//Car car2=new Car("Toyota","Innova", "Grey", 200.0, eng2, gear2);  //CDI
		
		System.out.println(car1);
		
		Car car2=new Car();
		
		
		car2.setCarColor("Grey");
		car2.setCarMfg("Toyota");
		car2.setCarModel("Innova");
		car2.setCarPrice(200.0);
		car2.setEngine(eng2);
		car2.setGear(gear2);
		
		System.out.println(car2);

	}

}
