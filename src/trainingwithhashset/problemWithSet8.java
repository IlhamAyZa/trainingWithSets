package trainingwithhashset;

import java.util.Set;
import java.util.TreeSet;

public class problemWithSet8 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();

        for (int i = 1 ; i < 11; i++){
            numbers.add(i);
        }

        System.out.println(numbers);

        System.out.println("_____________");
        System.out.println(numbers.pollFirst());
        System.out.println(numbers.pollLast());
        System.out.println("_____________");

        System.out.println(numbers);
    }

}