import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println("a is "+a+ " b is "+b);
        
    }
}
