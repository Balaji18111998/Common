package String;

import java.util.Scanner;

public class Reverse_using_Loop 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String Str=sc.next();
		String rev="";
		char[] ca = Str.toCharArray();
		for(int i=ca.length-1;i>=0;i--)
		{
			rev=rev+ca[i];			
		}
		System.out.println("Reversed String is " + rev);
	}

}
