import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        int principle;
        float years;
        float rate;
        double simpleInterest;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Principle : ");
        principle = input.nextInt();
        System.out.print("Enter the Interest Rate : ");
        rate = input.nextFloat();
        System.out.print("Enter the Time Duration (Years) : ");
        years = input.nextFloat();
        simpleInterest = (principle * years * rate)/100;
        System.out.println("The simple interest is : "+ simpleInterest);

    }
}
