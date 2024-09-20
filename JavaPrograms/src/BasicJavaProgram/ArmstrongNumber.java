package BasicJavaProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Please enter input number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int rev=0;
		int temp=num;
	
		while(num!=0)
		{
			
			int rem = num%10;  //3  5 1
			rev = rev+rem*rem*rem;  //27+125
			num=num/10;       //15 1
		}
		
		if(rev==temp)
		{
			System.out.println(temp+ " is armstrong number");
		}
		else
		{
			System.out.println("This is not armstrong number");
		}
	}

}
