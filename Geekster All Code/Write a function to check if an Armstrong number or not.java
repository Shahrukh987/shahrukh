import java.io.*;
import java.util.*;

public class Solution {
    public static boolean armstrome(int n)
    {
        int sum=0;
        int num=n;
        while(num>0)
        {
            int ld= num%10;
            sum+=ld*ld*ld;
            num/=10;
        }
 
        if(sum==n)
        {
            return true;
        }
        else
        {
            return false;
        }
            
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
      boolean ans = armstrome(n);
        System.out.println(ans);
    }
}