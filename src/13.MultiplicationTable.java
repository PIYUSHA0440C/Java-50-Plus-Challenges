import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to print the multiplication table of : ");
        num = input.nextInt();
        printMultiplicationTable(num);


    }

    public static void printMultiplicationTable(int num){
        int i =1;
        while(i <= 10){
            System.out.println(num+" X "+i+" = "+ num * i);
            i++;
        }
    }


}
