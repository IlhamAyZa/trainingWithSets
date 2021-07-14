package trainingwithhashset;

import java.util.HashSet;
import java.util.Set;

public class problemWithSet3 {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<Integer>();

        int[] numsToEnter = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 4, 5};
        int[] numsToCheck = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 15, 17, 18, 19, 20};

        for (int num : numsToEnter) {
            numbers.add(num);
        }

        for (int num : numsToCheck) {
            if (numbers.contains(num)) {
                System.out.println("Set contains " + num);
            }
        }
    }
}
