package lesson3.immutable;
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(15.6,14.3);
        System.out.println(r1);
        //Auto getters
        System.out.println(r1.length());
        System.out.println(r1.width());

    }
}
