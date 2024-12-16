import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the number : ");
        if(a%2==0){
            System.out.println("Even number ");
        }
        else{
            System.out.println("Odd Number  ");
        }
        
    }
}
