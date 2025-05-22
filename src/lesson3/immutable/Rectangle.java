package lesson3.immutable;

public record Rectangle(double length, double width){
    // If you want to validate arguments, can write the constructor logic
    public Rectangle {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException(
                    String.format("Invalid dimensions: %f, %f", length, width));
        }
    }

}
// Canonical constructor can be converted to compact form