
package matrix.addition;

import java.util.Scanner;


public class MatrixAddition {

    public static void main(String[] args) {
    // getting the user input for row and column
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int a=sc.nextInt();
        System.out.println("enter number of cols:");
        int b=sc.nextInt();
        
        int c[][]=new int[a][b];
        // two methods used for matrix addition
        entermatrixData(sc,c,a,b);
        printMatrix(c,a,b);
        
    
    // method 1
   public static void entermatrixData(Scanner sc,int[][]c,int a,int b){
            System.out.println("enter the row");
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    c[i][j]=sc.nextInt();
                }
            }
        }
        
        //method 2
        public static void printMatrix(int[][]c,int a,int b){
            System.out.println("Your matrix is:");
            for(int i=0;i<a;i++){
               for(int j=0;j<b;j++){
               //final result will stored in c
                   System.out.println(c[i][j]+"\t");
               } 
            }
        }
        
    }
    

    

