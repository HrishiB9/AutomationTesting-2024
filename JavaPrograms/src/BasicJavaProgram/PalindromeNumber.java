package BasicJavaProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		
		int rev=0;
		int num = s.nextInt();  //121
		int temp =num;
		while(num!=0)
		{
			int rem = num%10;   //1
			rev=  rev*10 + rem;  //1
			num = num/10;
		
		}
		if(rev==temp)
		{
			System.out.println("This is a palindrome number");
		}
		else
		{ 
			System.out.println("This is not palindrome number");
		}
	}

}
