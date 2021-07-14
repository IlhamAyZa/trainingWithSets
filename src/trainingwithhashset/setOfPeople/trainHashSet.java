package trainingwithhashset.setOfPeople;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class trainHashSet {
    public static void main(String[] args) {

        Set<String> someEuropeanCountries = new HashSet<>();
        Set<String> someEuropeanCountriesLinked = new LinkedHashSet<>();

        someEuropeanCountries.add("England");
        someEuropeanCountries.add("Russia");
        someEuropeanCountries.add("France");
        someEuropeanCountries.add("Italy");
        someEuropeanCountries.add("Germany");
        someEuropeanCountries.add("Spain");
        someEuropeanCountries.add("Poland");
        someEuropeanCountries.add("Belarus");
        someEuropeanCountries.add("Ukraine");
        someEuropeanCountries.add("Sweden");
        someEuropeanCountries.add("Norway");
        someEuropeanCountries.add("Turkey");
        someEuropeanCountries.add("Australia");
        someEuropeanCountries.add("Finland");
        someEuropeanCountries.add("Belgium");
        someEuropeanCountries.add("Greece");

        someEuropeanCountriesLinked.add("England");
        someEuropeanCountriesLinked.add("Russia");
        someEuropeanCountriesLinked.add("France");
        someEuropeanCountriesLinked.add("Italy");
        someEuropeanCountriesLinked.add("Germany");
        someEuropeanCountriesLinked.add("Spain");
        someEuropeanCountriesLinked.add("Poland");
        someEuropeanCountriesLinked.add("Belarus");
        someEuropeanCountriesLinked.add("Ukraine");
        someEuropeanCountriesLinked.add("Sweden");
        someEuropeanCountriesLinked.add("Norway");
        someEuropeanCountriesLinked.add("Turkey");
        someEuropeanCountriesLinked.add("Australia");
        someEuropeanCountriesLinked.add("Finland");
        someEuropeanCountriesLinked.add("Belgium");
        someEuropeanCountriesLinked.add("Greece");

        for (String country : someEuropeanCountries){
            System.out.println(country);
        }

        System.out.println("_________");
        System.out.println("LinkedHashSet:");

        for (String country : someEuropeanCountriesLinked){
            System.out.println(country);
        }

        Set<Person> people = new HashSet<>();
        Set<Person> peopleLinked = new LinkedHashSet<>();

        people.add(new Person(20, "Robert", Sex.MALE));
        people.add(new Person(26, "Maria",Sex.FEMALE));
        people.add(new Person(30, "Alex",Sex.MALE));
        people.add(new Person(22, "Merry",Sex.FEMALE));

        peopleLinked.add(new Person(20, "Robert", Sex.MALE));
        peopleLinked.add(new Person(26, "Maria",Sex.FEMALE));
        peopleLinked.add(new Person(30, "Alex",Sex.MALE));
        peopleLinked.add(new Person(22, "Merry",Sex.FEMALE));

        for (Person p : people){
            System.out.println(p);
        }

        System.out.println("_________");
        System.out.println("LinkedHashSet:");

        for (Person p : peopleLinked){
            System.out.println(p);
        }

    }
}
