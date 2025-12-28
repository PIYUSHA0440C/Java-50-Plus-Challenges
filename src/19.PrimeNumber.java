import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num : ");
        num = input.nextInt();
        String isPrime = isPrime(num) ? "Prime." : "not Prime";
        System.out.println("The entered number is "+isPrime);
    }

    private static boolean isPrime(int num){
        int i = 2;
        while (i < num){
            if( num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }



}
