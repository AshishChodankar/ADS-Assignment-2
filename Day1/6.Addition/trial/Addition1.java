
import java.util.*;

class Solution {
static float i;
static int n;
static float sum;
static float addition(float i,int n,float sum)
{
    if(i>n)
        return sum;
    else
        {
            if(i%2==0)
            {
                sum=sum-((float)1/i);
                i++;
                return addition(i,n,sum);
            }
            else
            {
                sum=sum+((float)1/i);
                i++;
                return addition(i,n,sum);
            }
            
        }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float res= addition(1,n,0);
        System.out.printf("%6f",res);

            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}