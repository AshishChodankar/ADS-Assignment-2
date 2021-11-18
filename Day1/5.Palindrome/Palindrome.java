import java.util.*;
class Palindrome
{
	static int i=0;
	static boolean fun()
	{
		String s="madam";
		char ch[]=s.toCharArray();
		int l=ch.length;
		
			if(i<l/2)
			{
				if(ch[i]!=ch[l-1-i])
				{
					return false;
				}
				else
				{
					i++;
					fun();
				}	
			}
		return true;
	}
	public static void main(String args[])
	{
		boolean res=fun();
		if(res==true)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		
	}
}