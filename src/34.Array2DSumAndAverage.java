class Array2DSumAndAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to the 2D Array Sum and Average finder...............");
        int[][] numArr = ArrayUtilities.input2DArray();
        long sum = sum2DArray(numArr);
        double avg = average2DArray(numArr);
        System.out.println("Sum of the elements in the array is : "+sum);
        System.out.println("Average of the elements in the array is : "+ avg);
    }
    public static double average2DArray(int[][] numArr){
        if (numArr.length == 0){
            return 0;
        }
        int rows = numArr.length;
        int cols = numArr[0].length;
        double size = rows * cols;
        return sum2DArray(numArr) / size;
    }

    public static long sum2DArray(int[][] numArr){
        long sum = 0;
        int i = 0;
        while (i < numArr.length){
            int j =0;
            while (j < numArr[i].length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }

        return sum;
    }
}
