import java.util.Scanner;

class Array2DSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the 2D Array searching..........");
        int[][] numArr = ArrayUtilities.input2DArray();
        System.out.print("Enter the value of the number you want to search : ");
        int num = input.nextInt();
        boolean isFound = search(numArr, num);
        System.out.println("You number is \"" + ((isFound)? "Found " : "Not Found ") + "\" in the Array.");
    }
    public static boolean search(int[][] numArr, int num){
        int i = 0;
        while (i < numArr.length){
            int j = 0;
            while (j < numArr[i].length){
                if(numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

}
