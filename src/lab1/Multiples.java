package lab1;

import java.util.ArrayList;
import java.util.List;

public class Multiples {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i=1; i<1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                list.add(i);
            }
        }

        int numberOfElements = list.size();

        System.out.println(numberOfElements);
    }
}
