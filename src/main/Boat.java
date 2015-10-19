package main;

import java.util.Scanner;

public class Boat 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		int num_cases = in.nextInt();
		
		for(int i = 0;i < num_cases;i++)
		{
			double x = in.nextDouble();
			double y = in.nextDouble();
			double distance = Math.sqrt(x*x + y*y);
			int year = (int) Math.ceil(Math.PI * distance * distance / 100);
			System.out.println("Property " + (i+1) + ": This property will begin eroding in year " + year);
		}
		System.out.println("END OF OUTPUT");
	}
}
