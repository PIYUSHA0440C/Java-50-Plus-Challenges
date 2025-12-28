import java.util.Scanner;

class GreatestCommonDivisor {
    public static void main(String[] args) {
        int num1, num2, gcd;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num1 : ");
        num1 = input.nextInt();
        System.out.print("Enter the value of num2 : ");
        num2 = input.nextInt();
        gcd =gcd(num1, num2);
        System.out.println("The GCD of numbers "+num1+" and "+num2+" is : "+ gcd);

    }

    public static int gcd(int num1, int num2){
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }

            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if(num1 < num2){
            return num1;
        } else {
            return num2;
        }

    }
}
