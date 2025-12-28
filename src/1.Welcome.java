import java.util.Scanner;

class Welcome {
    public static void main(String []args){
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.println("Welcome "+name+" to the coding.");
    }
}
