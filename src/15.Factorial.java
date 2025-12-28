import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        int num;
        long fact;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num : ");
        num = input.nextInt();
        fact = factorial(num);
        System.out.println("The factorial of "+num+" is : "+fact);
    }

    public static long factorial(int num){
        if(num < 2){
            return 1;
        }

        long fact =1;
        while (num > 1){
            fact *= num;
            num--;
        }

        return fact;
    }

}
