import java.io.*;
import java.util.*;

public class Solution {
    public static int maxpro3(int arr[])
    {
        int n= arr.length;
            int min1=Integer.MAX_VALUE;
        int min2=min1;
        int max1=Integer.MIN_VALUE;
        int max2=max1;
        int max3=max2;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=max1)
            {
                max3=max2;
                max2=max1;
                max1=arr[i];
            }else if(arr[i]>=max2)
            {
                max3=max2;
                max2=arr[i];
            }else if(arr[i]>max3)
            {
                max3=arr[i];
            }
//             min chek
            if(arr[i]<=min1)
            {
                  min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<=min2)
            {
                min2=arr[i];
            }
            
        }
        return Math.max(min1*min2*max1,max1*max2*max3);
         
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n= sc .nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         ;
        int ans = maxpro3(arr);
            System.out.println(ans+" ");
    }
}