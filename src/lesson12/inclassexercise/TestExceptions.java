package lesson12.inclassexercise;

import java.util.Scanner;

public class TestExceptions {
    public static void main(String[] args) {
        getData(1000,10);

    }
    // Fix the logic to overcome Error if possible
    public static void getData(int totscore, int count){
        if(totscore<0)
           throw new IllegalArgumentException("Score cannot be negative");
       else
        {
            if(count==0) throw new ArithmeticException();
            System.out.println(totscore/count);
        }

    }
}
