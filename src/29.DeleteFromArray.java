import java.util.Scanner;

class DeleteFromArray {
//    public static void main(String[] args) {
//        System.out.println("Welcome to array deletion...............");
//        int[] numArr =ArrayUtilities.inputArray();
//        System.out.print("Enter the value to be deleted : ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int occurences = occurences(numArr, num);
//        int []newArr = arrayNumberDeletion(numArr, num, occurences);
//        System.out.print("The new array after deletion is : ");
//        int j = 0;
//        while (j < newArr.length){
//            System.out.print(newArr[j]+" ");
//            j++;
//        }
//
//    }
//    public static int[] arrayNumberDeletion(int[] numArr, int num, int occurences){
//        int[] newArr = new int[numArr.length-occurences];
//        int i = 0;
//        int j = 0;
//        while (i < numArr.length-occurences){
//            if(numArr[i] != num){
//                newArr[j] = numArr[i];
//                j++;
//            }
//            i++;
//        }
//        return newArr;
//    }
//    public static int occurences(int[] numArr, int num){
//        int occurences = 0;
//        int i = 0;
//        while (i < numArr.length){
//            if(numArr[i] == num){
//                occurences++;
//            }
//            i++;
//        }
//        return occurences;
//    }

    public static void main(String[] args) {
        System.out.println("Welcome to array deletion...............");
        int[] numArr = ArrayUtilities.inputArray();
        System.out.print("No, Enter the number you want to delete : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] newArr = deleteNumber(numArr, num);
        System.out.println("Here is your new array : ");
        ArrayUtilities.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int num){
        int occ = ArrayNoOfccurrences.occurences(numArr, num);
        if (occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];
        int i = 0, j = 0;
        while (i < numArr.length){
            if (numArr[i] != num){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }

        return newArr;
    }


}
