
package largest.and.smallest;

import java.util.Scanner;


public class LargestAndSmallest {

    public static void main(String[] args) {
        //initializing the variable and temporary variable
        int n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of the elements");
         n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("enter all the elements");
        //finding the largest and smallest elements in the array
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[n-2]);
        System.out.println(arr[0]);
      
    }
    
}
