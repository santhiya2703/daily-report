
package largestelement;

import java.util.Scanner;


public class Largestelement {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements of elements you want in the array:");
        int n=sc.nextInt();
        int arr[]=new  int[n];
        System.out.println("enter all elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int l1,l2,temp = 0;
        l1=arr[0];
        l2=arr[1];
        // finding the largest two number in array
        if (l1<l2){
           temp=l1;
           l1=l2;
           l2=temp;
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>l1){
                l2=l1;
                l1=arr[i];
            }
            else if(arr[i]>l2 && arr[i]!=l1){
                l2=arr[i];
            }
        }
        System.out.println(l1);
        System.out.println(l2);
        
    }
    
}

