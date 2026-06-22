package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalStyleDemo {

	public static void main(String[] args) {
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		
		List<Integer> oddNumbersSquares=numbers.stream()		//[1,2,3,4,5]
		.filter(num->num%2==1)	//[1,3,5]filter uses a Predicate, what is Predicate? Predicate is a method which returns a boolean
		.map(num->num*num)						//[1,9,25]
		.toList();
		
		System.out.println(oddNumbersSquares);
		
		numbers.stream()		//[1,2,3,4,5]
				.filter(num->num%2==1)	//[1,3,5]filter uses a Predicate, what is Predicate? Predicate is a method which returns a boolean
				.map(num->num*num)						//[1,9,25]
				.forEach(num->System.out.println(num));
		
		
		List<Double> percentages=new ArrayList(Arrays.asList(91.6,87.5,58.3,78.5,56.9));
		//1. display marks which are greater than 70
		//2. Add 5% grace marks to marks greater than 70 and display new marks
		percentages.stream()
		.filter(per->per>=70.0)
		.forEach(per->System.out.println(per));
		
		percentages.stream()
		.filter(per->per>=70.0) //[91.6,87.5,78.5]
		.map(per->per+5.0)
		.forEach(per->System.out.println(per));
		
		
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		//1. display month names which has >= 5 chars
		System.out.println("********************");
		months.stream()
		.filter(month->month.length()>=5)
		.forEach(month->System.out.println("I like "+month));
		
		System.out.println("********************");
		months.stream()
		.filter(FunctionalStyleDemo::checkMonthLength)
		.forEach(System.out::println);
	}
	
	public static boolean checkMonthLength(String str)
	{
		if(str.length()>=5)
			return true;
		else
			return false;
	}
}
