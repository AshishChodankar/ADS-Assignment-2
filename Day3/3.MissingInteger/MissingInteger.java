import java.util.*;
class MissingInteger
{
	static int[] sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
		}
		return arr;
	}
	
	static int missing(int a[])
	{
		for(int k=0;k<a.length;k++)
		{
			if((a[k]+1)!=a[k+1])
			{
				return(a[k]+1);
			}
		}
	return -1;
	}
	
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter an number for size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			{
				 arr[i]=sc.nextInt();
			}
		int a[]=sort(arr);
		System.out.println(Arrays.toString(a));
		int res=missing(a);
		if(res==-1)
			{
				System.out.println("No Missing element:");
			}
		else
			{
				System.out.println("Missing element is:"+res);
			}
		
	}
}