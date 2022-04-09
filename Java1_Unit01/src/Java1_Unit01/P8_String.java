package Java1_Unit01;
import java.util.Scanner;
/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		
		 String original, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);  
	      
	      System.out.println("Enter a string/number to check if it is a palindrome"); 
	      
	      original = in.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string is a palindrome.");  
	      else  
	         System.out.println("Entered string isn't a palindrome.");   

	}

	void reverseOfAString(String s) {
		
		String str;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a string : ");
		str=scan.nextLine();	
		char[] ch=str.toCharArray(); 
		System.out.println("Reverse of a String is :"); 
		int j=ch.length;
		for(int i=j;i>0;i--)
		{
		System.out.print(ch[i-1]); 
		}
		
	}

	void stringEqualOrNot(String s1, String s2) {
		Scanner scanner = new Scanner(System. in);
		//read first string
		System.out.print("Enter first string : ");
		String str1 = scanner.nextLine();
		
		//read second string
		System.out.print("Enter second string : ");
		String str2 = scanner.nextLine();
		
		//check if two strings are equal
		boolean areTwoStringsEqual = str1.equals(str2);

		System.out.print("Two strings are equal : "+areTwoStringsEqual);
	}

	}
