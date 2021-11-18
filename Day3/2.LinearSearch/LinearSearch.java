import java.util.*;
class LinearSearch
{
	static int fun(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				return i;
			}		
		}
		return -1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[]{10,20,80,30,60,50,110,100,130,170};
		int key=n;
		int res=fun(arr,key);
		if(res==-1)
		{
			System.out.println("Key not found");
		}
		else
		{
			System.out.println("Key found");
		}
	}
}