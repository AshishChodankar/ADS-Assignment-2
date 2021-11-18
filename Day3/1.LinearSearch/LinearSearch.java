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
		int arr[]=new int[]{20,35,37,40,45,50,51,55,67};
		int key=37;
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