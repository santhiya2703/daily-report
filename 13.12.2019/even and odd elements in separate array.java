
package even.and.odd;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args){
 
        int n, j = 0, k = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of elements you want in array:");
        n = s.nextInt();
        //creating three arrays 
        int a[] = new int[n];
        int odd[] = new int[n];
        int even[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        //spliting the even and odd array separate arrays
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 != 0)
            {
                odd[j] = a[i];
                j++;
            }
            else
            {
                even[k] = a[i];
                k++;
            }
        }
        System.out.println("Odd:");
        if(j > 1)
        {
            for(int i = 0;i < (j-1); i++)
            {
                System.out.println(odd[i]+",");
            }
            System.out.println(odd[j-1]);
        }
        else
        {
            System.out.println("No number");
        }
        System.out.println("");
        System.out.println("Even:");
        if(k > 1)
        {
            for(int i = 0; i < (k-1); i++)
            {
                System.out.println(even[i]+",");
            }
        System.out.println(even[k-1]);
        }
        else
        {
            System.out.println("No number");
        }
    }
}

    
