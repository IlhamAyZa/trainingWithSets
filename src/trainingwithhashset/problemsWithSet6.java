package trainingwithhashset;

import java.util.Set;
import java.util.TreeSet;

public class problemsWithSet6 {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<Integer>();

        for (int i = 1 ; i < 11; i++){
            numbers.add(i);
        }

        System.out.println(numbers);
    }


}
