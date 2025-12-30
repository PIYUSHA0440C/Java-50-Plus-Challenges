class ArrayDiagonalElementSum {
    public static void main(String[] args) {
        System.out.println("Welcome to the diagonal sum.................");
        int[][] numArr = ArrayUtilities.input2DArray();
        long sumOfDiagonals = sumOfDiagonals(numArr);
        System.out.println("Sum of the diagonal elements of the array is : "+sumOfDiagonals);
        finalize;
    }

    public static long sumOfDiagonals(int [][] numArr){
        long lefSum = sumOfLeftDiagonal(numArr);
        long rightSum = sumOfRightDiagonal(numArr);
        long sum = lefSum + rightSum;
        if (numArr.length % 2 != 0){
            int index = numArr.length / 2;
            sum -= numArr[index][index];
        }
        return sum;
    }

    public static long sumOfLeftDiagonal(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length){
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int[][] numArr){
        long sum = 0;
        int i = 0;
//        while (i < numArr.length){
//            sum += numArr[i][(numArr.length - 1) - i];
//            i++;
//        }
        while (i < numArr.length){
            int col = numArr.length - 1 - i;
            sum += numArr[i][col];
            i++;
        }

        return sum;
    }

}
