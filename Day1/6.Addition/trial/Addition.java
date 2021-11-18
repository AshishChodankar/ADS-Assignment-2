
class Addition
{
	static double sum=0;
	static double n=1;
	
	static double fun()
	{
		if(n<=3)
		{
			
			if(n%2==0)
			{	
				sum=sum+((double)1/n);
				n+=1;
				fun();
				System.out.println(""+sum);
			}
			else
			{
			
				if(sum==0)
				{
					sum=sum+((double)1/n);
					n+=1;
					fun();
				}
				else
				{
					sum=sum-((double)1/n);
					n+=1;
					fun();	
				//System.out.println(""+sum);
				}
			
			}
		}
		return sum;

	}

public static void main(String args[])
	{
		System.out.println(""+fun());
	}
}
