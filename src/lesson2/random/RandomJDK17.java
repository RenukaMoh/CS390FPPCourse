package lesson2.random;
import java.util.Random;
import java.util.random.RandomGenerator;
public class RandomJDK17 {
    public static void main(String args[])  {
        // Get the Random Generator Object
        RandomGenerator rg = RandomGenerator.getDefault();
        int r1 = rg.nextInt();
        // Get the Random Integer
       var rn1 =  RandomGenerator.getDefault().nextInt();
        System.out.println(rn1);
        // Print five random double values
        for(int i=1;i<=5;i++){
            System.out.printf("%.2f\n",rg.nextDouble(100));
        }

        // From JDK 17, Random class implements RandomGenerator. Can use all the methods from it
        Random random = new Random();
        System.out.println(random.nextDouble(10.5,23.5));
        System.out.println(random.nextInt()); // Any Integer

        double rnumber = Math.random(); // Range of 0 to 1
        System.out.println("Math Random = "+rnumber);
    }
}
