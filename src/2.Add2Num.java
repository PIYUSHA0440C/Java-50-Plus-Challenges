import java.util.Scanner;

class Add2Num {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a = input.nextInt();
        System.out.print("Enter the value of b : ");
        b = input.nextInt();
        System.out.println("The addition of a and b is : "+ (a+b));
    }
}
