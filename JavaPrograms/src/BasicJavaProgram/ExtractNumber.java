package BasicJavaProgram;

public class ExtractNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "vgtiuyu7687ojkmbhgcrtd456t78790";
		
		for(char ch: str.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				System.out.print(ch+" ");
			}
		}
	}

}
