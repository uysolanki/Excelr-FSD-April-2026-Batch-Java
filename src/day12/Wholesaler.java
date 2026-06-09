//if the ordered qty is less than 500 we will throw our user defined exception / custom exception

package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wholesaler {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("Please enter qty");  //apple
			int qty=sc.nextInt();
			
			if(qty<500)
			{
			throw new LowQuantityException("Please enter qty greater than 500");
			}
			else
			{
				System.out.println("Order Placed Successfully");
			}
			
		}
		catch(LowQuantityException ex1)
		{
			System.out.println(ex1.getMessage());
		}
		
		catch(InputMismatchException ex2)
		{
			System.out.println("Please enter valid integer values only");
		}

	}

}
