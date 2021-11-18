/*
Given a string that consists of left and right parentheses, '(' and ')', balance the parentheses by inserting parentheses as necessary. Determine the minimum number of characters that must be inserted.

Example

s = '(()))'

Insert 1 left parenthesis at the left end of the string to get '((()))'. The string is balanced after 1 insertion.

Input Format

The first line contains a string, s, the initial parentheses sequence.

Constraints

Constraints

1 ≤ length of s ≤ 10^5

Output Format

.

Sample Input 0

STDIN     Function
-----     -----
()))   -> s = '()))'
Sample Output 0

2
Explanation 0

Insert a '(' 2 times at the beginning of the string to make it valid: '((()))'.
*/
import java.io.*;
import java.util.*;

public class Solution {
 
   
    static int minParentheses(String p)
    {
       
        // maintain balance of string
        int bal = 0;
        int ans = 0;
       
        for (int i = 0; i < p.length(); ++i) {
       
            bal += p.charAt(i) == '(' ? 1 : -1;
       
            // It is guaranteed bal >= -1
            if (bal == -1) {
                ans += 1;
                bal += 1;
            }
        }
       
        return bal + ans;
    }
     
   public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       //String p=sc.nextLine();
       String p = "()))";
         
        System.out.println(minParentheses(p));
       
    }
    
}