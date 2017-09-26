package ie.LAB3.oosd;

import java.util.Scanner;

public class LAB3A {

	public static void main(String[] args) 
	{
		
		
		Scanner input = new Scanner( System.in );            
		int integer;
		float float1;
		long long1;
		double decimal1;
		String string1;
		
		System.out.print("Enter your int : ");
		integer = input.nextInt();
		System.out.println();
		
		System.out.print("Enter your float : ");
		float1 = input.nextFloat();
		System.out.println();
		
		System.out.print("Enter your long num : ");
		long1 = input.nextLong();
		System.out.println();
		
		System.out.print("Enter your Decimal num : ");
		decimal1 = input.nextDouble();
		System.out.println();
		
		System.out.print("Enter your string : ");
		string1 = input.next();
		System.out.println();
		
		System.out.println("Int and float :" +(integer+float1));
		System.out.println("Int and long :" +(integer+long1));
		System.out.println("Int and double :" +(integer+decimal1));
		System.out.println("Int and string :" +(integer+string1));
		System.out.println("float and long :" +(float1+long1));
		System.out.println("float and double :" +(float1+decimal1));
		System.out.println("float and string :" +(float1+string1));
		System.out.println("long and double :" +(long1+decimal1));
		System.out.println("long and string :" +(long1+string1));
		System.out.println("double and string :" +(decimal1+string1));
		
	}

}
