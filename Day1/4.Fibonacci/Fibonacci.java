class Fibonacci// Fibonaccii series of first five numbers
{
	static int first=0;
	static int second=1;
	static int count=0;
	static void show()
	{
		System.out.print(""+first+","+""+second+",");
	}
	
	static void fun()
	{
		count++;
		if(count<=10)
		{
				int third= first+second;
				first =second;
				second=third;
				//System.out.printf("%d,",first);
				System.out.printf("%d,",second);
				fun();
		}
			
	}
	
	
	public static void main(String args[])
	{
			show();
			fun();
	}
}