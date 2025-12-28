import java.util.Scanner;

class ArithmeticOperators {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc.nextInt();
        System.out.println("a+b = "+ (a+b));
        System.out.println("a-b = "+ (a-b));
        System.out.println("a*b = "+ (a*b));
        System.out.println("a/b = "+ (a/b));
        System.out.println("a%b = "+ (a%b));
    }
}
