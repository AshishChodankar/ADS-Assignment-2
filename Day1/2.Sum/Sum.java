class Sum
{
	static int i=0;
	static int s=0;
	static void sumFun()
	{
		++i;
		if(i<=3)
		{
			System.out.println(i);
			s=s+i;
			sumFun();
		}
	}
	static void show()
	{
		System.out.println("Sum of given numbers:"+s);
	}
	
	public static void main(String args[])
	{
		sumFun();
		show();
	}
}






















/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Total numbers in the series:");
		int n=sc.nextInt();
		int arr[]=new arr[n];
		for(int i=0;i<n;i++)
		{
			int arr[i]=sc.nextInt();
		}
		for(j=0;j<n;j++)
		{
			sum=sum+ arr[j];
		}
		*/