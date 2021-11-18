import java.io.*;
import java.util.*;

 public class HappyNumber {
    static int isHappyNumber(int num)
    {  
        int sum=0;
        int rem=0;
         while(num>0)
        {
        rem=num%10;
        sum=sum+(rem*rem);
        num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("List of happy numbers between 1 and 100:");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */      
        Solution s1=new Solution();
        for(int i=m;i<=n;i++)
        {
            
            int result=i;
            while(result!=1 && result!=4)
            {
                 result=isHappyNumber(result);
            }
            
            if(result==1)
            {
                System.out.print(""+i+" ");
            }
        }
       
        
    }
}