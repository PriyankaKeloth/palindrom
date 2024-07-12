package palindrompkg;
import java.util.Scanner;

public class Palindrom {

	     public static void main(String args[])
	     {
	 		Palindrom p=new Palindrom();
	         Scanner sc = new Scanner(System.in);
	 		System.out.println("Enter the first string");
	         String strg1 = sc.next();
	         System.out.println("Enter the second string");
	 		String strg2 = sc.next();
	 		p.palindrome(strg1);
	 		p.palindrome(strg2);
	 	}	
	 		
	 	public void palindrome(String s)
	 	{
	 		String reverse = "";
	         for (int i=s.length() -1; i>=0; i--)
	         {
	             reverse = reverse + s.charAt(i);
	         }
	         System.out.println(reverse);
	         if (s.equals(reverse))
	         {
	             System.out.println(s + " is   Palindrome");
	         }
	         else
	         {
	             System.out.println(s + " is not Palindrome");
	         }
	      }
	 


	}


