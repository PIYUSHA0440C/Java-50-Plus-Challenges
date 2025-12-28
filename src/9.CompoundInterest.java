import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        int principle;
        float rate, time;
        double compoundInterest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Principle : ");
        principle = input.nextInt();
        System.out.print("Enter the Interest Rate : ");
        rate = input.nextFloat();
        System.out.print("Enter the Time Duration (Years) : ");
        time = input.nextFloat();
        compoundInterest = principle * Math.pow((1 + rate/100), time);
        System.out.println("The simple interest is : "+ compoundInterest);
    }
}
