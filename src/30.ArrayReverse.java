class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Reverse............");
        int[] numArr = ArrayUtilities.inputArray();
        reverseArray(numArr);
        System.out.println("Your reversed array is : ");
        ArrayUtilities.displayArray(numArr);
    }
    public static void reverseArray(int []numArr){
        int i = 0;
        while (i < numArr.length / 2){
             int swap = numArr[i];
             numArr[i] = numArr[(numArr.length - 1) - i ];
             numArr[(numArr.length - 1) - i] = swap;
            i++;
        }
    }

}
