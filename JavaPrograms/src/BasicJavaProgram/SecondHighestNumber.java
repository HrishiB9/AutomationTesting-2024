package BasicJavaProgram;

public class SecondHighestNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int a[] = {2,55,23,32,98,3,45};
		int total = a.length;
		//System.out.println("Total numbers:"+total);
		
		System.out.println("Second largest number of array is :" +getSecondLargest(a,total));
		

	}
	
	public static int getSecondLargest(int a[], int total)
	{
		int temp;
		for(int i=0; i<total; i++)
		{
			for(int j=i+1; j<total; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		return a[total-2];
		
	}

}
