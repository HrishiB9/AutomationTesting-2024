package BasicJavaProgram;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int Result = 1;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Number:");
		 
		 int factNum = sc.nextInt();
		 
		 for(int i=1;i<=factNum; i++)
		 {
			  Result = Result *i;
			 
		 }
		 
		 System.out.println("Factorial Total value: "+Result);
	}

}
