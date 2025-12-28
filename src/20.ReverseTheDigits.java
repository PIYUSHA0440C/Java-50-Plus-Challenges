import java.util.Scanner;

class ReverseTheDigits {
    public static void main(String[] args) {

        int num, reverse;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num : ");
        num = input.nextInt();
        reverse =reverse(num);
        System.out.println("The reverse of "+num+" is "+ reverse);
    }
    public static int reverse(int num){
        int reverse =0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;

    }

}
