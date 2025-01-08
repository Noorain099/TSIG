import java.lang.*;
import java.util.*;
class MyClass
{
    public static void main(String args[])
    {   Scanner sc = new Scanner(System.in);
             int a[] = new int [10];
            int b[] = new int [20];
            a[0] = 12;
            a[1] = 4;
            a[2] = 2;
            a[3] = 22;
            a[4] = 17;
            a[5] = 9;
            a[6] = 11;
            a[7] = 56;
            a[8] = 8;
            
            for(int i = 0; i<a.length;i++){
            System.out.print(a[i]+", ");
            }
            System.out.println("");
            System.out.println("How many new elements do you want to add?");
            int n = sc.nextInt();
            for(int i = 0;i<a.length;i++)       
            b[i]=a[i];
          
           System.out.println("Enter " + n + " new elements:");
           for(int i =a.length,j=0; j < n && i < b.length; i++, j++){
            b[i] = sc.nextInt();}

         System.out.println("after  a new element");
              for(int i = 0; i<b.length;i++)
            System.out.print(b[i]+", ");
            System.out.println("");

    }
}

