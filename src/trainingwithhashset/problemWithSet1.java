package trainingwithhashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class problemWithSet1 {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<Integer>();

        int unic = 0;
        int[] nums = {1, 3, 3, 23, 1, 25, 6, 7, 23, 34, 45, 23, 1, 55};

        for (int i : nums) {
            if (numbers.add(i) == true) {
                unic++;
            }

        }

        System.out.println(" Number of unic: " + unic);

    }
}
