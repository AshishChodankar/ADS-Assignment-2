class Recursion1
{
	static int n=0;
	static void fun()
	{
		++n;
		if(n<=10)
		{
			System.out.println(n);
			fun();
		}
	}
	public static void main(String args[])
	{
		fun();
	}
}