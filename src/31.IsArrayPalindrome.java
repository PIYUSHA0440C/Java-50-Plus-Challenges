class IsArrayPalindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome arra checker...........");
        int[] numArr = ArrayUtilities.inputArray();
        boolean isPalindrome = isPalindromeAraay(numArr);
        System.out.println("The array is "+ (isPalindrome ? "Palindrome." : "Not Palindrome."));
    }

    public static boolean isPalindromeAraay(int[] numArr){
        int i = 0;
        while (i < numArr.length / 2){
            if (numArr[i] != numArr[(numArr.length - 1) - i]){
                return false;
            }
            i++;
        }
        return true;
    }

}
