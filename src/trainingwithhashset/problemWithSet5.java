package trainingwithhashset;

import java.util.HashSet;
import java.util.Set;

public class problemWithSet5 {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<Integer>();

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 4, 5};

        for (int num : nums) {
            numbers.add(num);
        }
        System.out.println(numbers);

        if (numbers.isEmpty() == false) {
            for (int num : nums) {
                numbers.remove(num);
            }
        }
        System.out.println("After");
        System.out.println(numbers);
    }
}
