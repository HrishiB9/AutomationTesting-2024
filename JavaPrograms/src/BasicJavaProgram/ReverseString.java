package BasicJavaProgram;

public class ReverseString {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String s="Hrishikesh";
		String rev = "";
		
		int length = s.length();
		
		for(int i=length-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
				
		System.out.print(rev);

	}

}
