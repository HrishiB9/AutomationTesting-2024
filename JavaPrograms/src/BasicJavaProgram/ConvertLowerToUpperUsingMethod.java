package BasicJavaProgram;

public class ConvertLowerToUpperUsingMethod {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s1 = "geeKS JaVA t pOINt";
		
		s1= s1.toLowerCase();
		System.out.println(s1);
		System.out.println(s1.length());
		StringBuffer s = new StringBuffer();
		System.out.println(s);
		char ch=' ';
		for(int i=0; i<s1.length();i++)
		{
			if(ch==' ' && s1.charAt(i)!=' ')
			{
				s.append(Character.toUpperCase(s.charAt(i)));
			}
			else
			{
				s.append(s1.charAt(i));
				ch = s1.charAt(i);
			}
			
		}
		s.toString().trim();
		System.out.println(s.toString());
	}

}
