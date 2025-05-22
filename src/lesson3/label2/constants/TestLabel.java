package lesson3.label2.constants;

public class TestLabel {
    public static void main(String[] args) {
        Label l1 = new Label("Enter Name",LabelConstants.LEFT);
        Label l2 = new Label("Enter Age",2);
        l2.setAlignment(12); // No compile error, Give runtime error

    }
}
