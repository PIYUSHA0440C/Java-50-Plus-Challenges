import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to array sum and average.........");
        int[] numArray = ArrayUtilities.inputArray();
        long sum = sumArray(numArray);
        double avg = averageArray(numArray);
        System.out.println("The Sum of element present in array is : "+ sum);
        System.out.println("The Average of elements present in array is : "+avg);

    }

    public static long sumArray(int[] array){
        long sum = 0;
        int i = 0;
        while (i < array.length){
            sum += array[i];
            i++;
        }
        return sum;
    }


    public static double averageArray(int[] array){
        double sum = sumArray(array);
        return (sum / array.length);
    }

}
