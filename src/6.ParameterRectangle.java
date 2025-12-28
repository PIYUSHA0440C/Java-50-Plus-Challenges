import java.util.Scanner;

class ParameterRectangle {
    public static void main(String[] args) {
        float length, width ;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the height of the rectangle : ");
        length = sc.nextFloat();
        System.out.print("Enter the breadth of the rectangle : ");
        width = sc.nextFloat();
        System.out.println("The parameter of the rectangle is : "+ 2*(length+ width));
    }
}
