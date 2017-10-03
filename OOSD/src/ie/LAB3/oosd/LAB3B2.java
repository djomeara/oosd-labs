package ie.LAB3.oosd;
import java.util.Scanner;
public class LAB3B2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner ( System.in);
		String sent1;
		String sent2 = "";
		int value;
		int ascii;
		int index;
		char currentChar;
	
		System.out.print("Enter your word : ");
		sent1 = input.next();
		System.out.println("");
		for(index=0; index<sent1.length();index++)
			{
				value = sent1.charAt(index);
				ascii = (int)value;
				currentChar=(char) ( ascii+1);
				sent2 += currentChar;
			}
		System.out.println(sent2);

	}

}

/*	value = sent1.charAt(index);
	ascii = (int)value;
	currentChar=(char) ( ascii+1);
	sent2 += currentChar;
	
	is needed to cast a char to ascii and back to char  
	
	*/
