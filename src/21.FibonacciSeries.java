import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        int num, fibonacci;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range of fibonacci series ( 0 to range) : ");
        num = input.nextInt();
        fibonacciSeries(num);
    }
    public static void fibonacciSeries(int num){
        if(num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");
        int first = 0, second = 1;
        while (first + second <= num){
            int third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }

    }

}
