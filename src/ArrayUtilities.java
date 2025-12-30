import java.util.Scanner;

public class ArrayUtilities {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of elements : ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Enter the element no. " + (i+1) +" : ");
            nums[i] = sc.nextInt();
            i++;
        }
        return nums;
    }

    public static void displayArray(int[] numArr){
        int i = 0;
        while (i < numArr.length){
            System.out.print(numArr[i]+" ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Please enter the number of columns : ");
        int cols = sc.nextInt();
        int[][] numArr = new int[rows][cols];
        int i = 0;
        while (i < rows){
            int j = 0;
            System.out.println("=====================================================");
            while (j < cols){
                System.out.print("Enter the element of Row no. " + (i+1)
                        +" and Column no. "+(j+1)+" : ");
                numArr[i][j] = sc.nextInt();
                j++;
            }
            i++;
        }
        System.out.println("=====================================================");
        return numArr;
    }

}
