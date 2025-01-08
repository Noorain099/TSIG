import java.lang.*;
import java.util.*;
class MyClass
{
    public static void main(String args[])
    {   Scanner sc = new Scanner(System.in);
             int a[] = new int [10];
            System.out.println("Enter elements in the array");
            for(int i=0;i<a.length;i++){
                a[i] = sc.nextInt();
            }
            System.out.println("The Array is ");
            for(int i =0; i<a.length;i++)
            System.out.print(a[i]+",");
            System.out.println();
            System.out.println("Reversed Array");
            for(int i = a.length-1;i>=0;i--){
                System.out.print(a[i]+",");
            } System.out.println();
           

    }
}
