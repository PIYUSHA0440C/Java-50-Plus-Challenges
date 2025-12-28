import java.util.Scanner;

class LeastCommonMultiple {
    public static void main(String[] args) {
        int num1, num2, lcm;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of num1 : ");
        num1 = input.nextInt();
        System.out.print("Enter the value of num2 : ");
        num2 = input.nextInt();
        lcm =lcmOfTwoNum(num1, num2);
        System.out.println("The LCM numbers "+num1+" and "+num2+" is : "+lcm);
    }

    public static int lcmOfTwoNum(int num1, int num2){
        int i = 1;
        while(true){
            int factor = num1 * i;
            if(factor % num2 == 0){
                return factor;
            }

            i++;
        }

    }

}
