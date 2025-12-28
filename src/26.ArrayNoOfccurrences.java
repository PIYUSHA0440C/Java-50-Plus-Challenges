import java.util.Scanner;

class ArrayNoOfccurrences {
    public static void main(String[] args) {
        System.out.println("Welcome to element occurrences counter in array............");
        int[] array = ArrayUtilities.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be found occurrences of : ");
        int num = sc.nextInt();
        int occurrences = occurences(array, num);
        System.out.println("The element occured "+ occurrences + " times in the array.");
    }

    public static int occurences(int [] array, int num){
        int occurences = 0;
        int i = 0;
        while (i < array.length){
            if(array[i] == num){
                occurences++;
            }
            i++;
        }

        return occurences;
    }
}
