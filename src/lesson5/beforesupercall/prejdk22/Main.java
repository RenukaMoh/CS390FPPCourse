package lesson5.beforesupercall.prejdk22;


public class Main {
    public static void main(String[] args) {
        PositiveBigInteger bi1 = new PositiveBigInteger(12l);
        System.out.println(bi1);
        PositiveBigInteger bi2 = new PositiveBigInteger(-12l);
        System.out.println(bi2);
    }
}
