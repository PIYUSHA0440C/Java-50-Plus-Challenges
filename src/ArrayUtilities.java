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
}
