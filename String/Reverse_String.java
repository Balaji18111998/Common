package String;

import java.util.Scanner;

public class Reverse_String 
{
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.next();
		StringBuilder str1=new StringBuilder();
		StringBuilder append= str1.append(str);
		append.reverse();
		System.out.println(append);
		
	}
	
	public void g() 
	{
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println(c);
	}
	}

}
