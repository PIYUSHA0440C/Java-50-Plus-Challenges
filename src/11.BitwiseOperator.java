class BitwiseOperator {
    public static void main(String[] args) {
        int a = 12, b = 5;
        System.out.println("Bitwise AND of 12 and 5 is : "+ (a&b));
        System.out.println("Bitwise OR of 12 and 5 is : "+ (a|b));
        System.out.println("Bitwise XOR of 12 and 5 is : "+ (a^b));
        System.out.println("Bitwise Compliment of a is : "+ (~a));
        System.out.println("Bitwise Left Shift of a is : "+ (a<<1));
        System.out.println("Bitwise Right Shift of a is : "+ (a>>1));
        System.out.println("Bitwise Left Shift of a is : "+ (a<<2));
        System.out.println("Bitwise Right Shift of a is : "+ (a>>2));

    }
}
