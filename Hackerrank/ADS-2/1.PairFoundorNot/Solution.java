/*Find a pair with the given sum in an array Given an unsorted array, find a pair with the given sum in it.

Input Format

Input:

arr = [8, 7, 2, 5, 3, 1]

sum = 10

Constraints

.

Output Format

Output:

Pair found (8, 2)

or

Pair found (7, 3)

Sample Input 0

5, 2, 6, 8, 1, 9
12
Sample Output 0

Pair not found*/
import java.io.*;
import java.util.*;

public class Solution {

    static boolean pairFind(int a[],int s)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]+a[i]==s)
                {
                     System.out.println("Pair found"+"("+a[i]+","+a[j]+")");
                     return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=sc.nextInt();
        boolean res=pairFind(arr,sum);     
            if(res==true)
            {
                 System.out.println("Valid Pair");
            }
            else
            {
                System.out.println("Pair not found");
            }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}