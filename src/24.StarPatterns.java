import java.util.Scanner;

class StarPatterns {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of rows for the star patterns : ");
        num = sc.nextInt();
        rightHalfTriangle(num);
        reverseRightHalfTriangle(num);
        leftHalfTriangle(num);
        reverseLeftHalfTriangle(num);
        upperTriangle(num);
        lowerTriangle(num);
    }

    public static void rightHalfTriangle(int num){
        System.out.println("The Right Half Triangle : ");
        int i = 0;
        while (i < num){
            int j = 0;
            while (j <= i){
                System.out.print("* ");

                j++;
            }
            System.out.println();
            i++;
        }

    }

    public static void reverseRightHalfTriangle(int num){
        System.out.println("The Reverse Right Half Triangle : ");
        while (num > 0){
            int i = num;
            while (i > 0){
                System.out.print("* ");
                i--;
            }
            System.out.println();
            num--;
        }
    }

    public static void leftHalfTriangle(int num){
        System.out.println("The Left Half Triangle :");
        int maxRows = num;
        while (num > 0){
            int i = 1;
            while (i < num){
                System.out.print("  ");
                i++;
            }
            int j = 0;
            while (j <= (maxRows - num)){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            num--;
        }
    }

    public static void reverseLeftHalfTriangle(int num){
        System.out.println("the Reverse Left Half Triangle");
        int maxRows = num;
        while (num > 0){
            int i = 0;
            while (i < (maxRows - num)){
                System.out.print("  ");
                i++;
            }
            int j = 0;
            while (j < num){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            num--;
        }


    }

    public static void upperTriangle(int num){
        System.out.println("The Upper Triangle : ");
        int maxRows = num;
        while (num > 0){
            int i = 1;
            while (i < num){
                System.out.print(" ");
                i++;
            }
            int j = 0;
            while (j <= (maxRows -num)){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            num--;
        }
    }

    public static void lowerTriangle(int num){
        System.out.println("The Lower triangle : ");
        int maxRows = num;
        while (num > 0){
            int i = 0;
            while (i < (maxRows - num)){
                System.out.print(" ");
                i++;
            }

            int j = 0;
            while (j < num){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            num--;
        }
    }

}
