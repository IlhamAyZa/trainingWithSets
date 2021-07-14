package trainingwithhashset;

import java.util.Set;
import java.util.TreeSet;

public class problemWithSet7 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<Integer>();

        for (int i = 10 ; i > 0; i--){
            numbers.add(i);
        }

        System.out.println("Smallest: "+numbers.first());
        System.out.println("Greatest: "+numbers.last());
    }
    /*
    public int getSmallest(TreeSet<Integer> setOfInts){
        setOfInts.first();
    }
         */
}
