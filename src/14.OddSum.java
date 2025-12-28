import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        int num, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num : ");
        num = input.nextInt();
        sum = oddSum(num);
        System.out.println("The sum of Odd Numbers till "+num+" is : "+sum);
    }

    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        while (i <= num){
                sum += i;
                i += 2;
        }
        return sum;
    }

}
