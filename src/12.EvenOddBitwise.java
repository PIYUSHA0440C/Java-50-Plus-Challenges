import java.util.Scanner;

class EvenOddBitwise {
    /** hhbbbbjh */
    public static void main(String[] args) {
        /* */
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the Value of num : ");
        num = input.nextInt();
        if((num&1) == 1) {
            System.out.println("It's Odd.");
        } else {
            System.out.println("It's Even.");
        }
    }
}
