import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        int num;
        boolean isPalindrome;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num : ");
        num = input.nextInt();
        isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("The number is Palindrome.");
        } else {
            System.out.println("The number is not Palindrome.");
        }

    }

    public static boolean isPalindrome(int num){
        int reverse = ReverseTheDigits.reverse(num);

        return reverse == num;
    }

}
