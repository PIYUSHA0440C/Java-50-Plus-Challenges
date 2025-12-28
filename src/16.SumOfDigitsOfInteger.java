import java.util.Scanner;

class SumOfDigitsOfInteger {
    public static void main(String[] args) {
        int num, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num : ");
        num = input.nextInt();
        result =sumOfDigits(num);
        System.out.println("The sum of digits of integer number "+num+" is : "+result);
    }
    public static int sumOfDigits(int num){
        int sum =0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
