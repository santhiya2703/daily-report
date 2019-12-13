
package max;

import java.util.Scanner;


public class Max {

    public static void main(String[] args) {
    int n,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter all the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        
    }
        //Finding the maximum elements in the array
        max=arr[0];
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    
}
