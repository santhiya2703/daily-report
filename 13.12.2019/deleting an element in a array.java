import java.util.Scanner;
public class Delete
{
    public static void main(String[] args) 
    {
        int n, x, flag = 1, l = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.println("Enter the element you want to delete:");
        x = s.nextInt();
        for (int i = 0; i < n; i++) 
        {
            if(a[i] == x)
            {
                flag =1;
                l = i;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            for(int i = l+1; i < n; i++)
            {
                a[i-1] = a[i];
            }
            System.out.println("After Deleting:");
            for (int i = 0; i < n-2; i++) 
            {
                System.out.println(a[i]+",");
            }
            System.out.println(a[n-2]);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
