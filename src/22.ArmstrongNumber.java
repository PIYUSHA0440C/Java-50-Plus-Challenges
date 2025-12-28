import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check if it is armstrong : ");
        num = input.nextInt();
        if(isArmstrong(num)){
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is not Armstrong");
        }

    }

    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber =0;
        while (numCopy > 0){
            int lastDigit = numCopy % 10;
            numCopy /= 10;
            finalNumber += power(lastDigit, noOfDigits);
        }

        return finalNumber == num;

    }

    public static int power(int num, int power){
        int result = 1;
        int i = 0;
        while (i < power){
            result *= num;

            i++;
        }
        return result;

    }


    public static int noOfDigits(int num){
        int digits = 0;
        while (num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }

}
