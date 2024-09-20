package BasicJavaProgram;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int m,num, flag=0;
		System.out.println("Please enter number: ");
		Scanner s= new Scanner(System.in);
		 num = s.nextInt();
			m=num/2;	 
		if(num==0 || num==1)
		{
			System.out.println("This is not prime number");
		}
		
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(num%i==0)
				{
					System.out.println("This is not prime number");
					flag=1;
					break;
				}
			}
		}
		
		if(flag==0)
		{
			System.out.println(num+" is a prime number");
		}
	}

}
