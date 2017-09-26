package ie.LAB3.oosd;
import java.util.Scanner;
public class LAB3B {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );
		String string1;
		String string2 = "";
		char char1;
		int index;
		
		System.out.print("Enter your word : ");
		string1 = input.next();
		System.out.println("");
		
		for (index=string1.length()-1; index>=0; index--)
			{
				char1 = string1.charAt(index);
				string2 +=char1;
			}
		System.out.println("The Reverse is : " +string2);
			
	}

}
