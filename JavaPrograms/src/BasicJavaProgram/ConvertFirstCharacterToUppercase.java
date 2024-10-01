package BasicJavaProgram;

public class ConvertFirstCharacterToUppercase {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str = "geeKS  jAVa t PoiNT";
		
		char ch[] = str.toCharArray();
		for(int i=0; i<str.length(); i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				if(ch[i]>='a' && ch[i]<='z' )
				{
					//convert lower to upper
					ch[i] = (char) (ch[i]- 'a'+'A');
				}
			}
			else if (ch[i]>='A' && ch[i]<='Z') {
				//convert upper to lower
				ch[i] = (char) (ch[i]+'a'-'A');
			}
			
			
		}
		String st = new String(ch);
		System.out.println(st);
	}

}
