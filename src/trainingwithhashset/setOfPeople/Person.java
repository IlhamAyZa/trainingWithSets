package trainingwithhashset.setOfPeople;

public class Person {

    int age;
    String name;
    Sex sex;

    public Person (int age, String name, Sex sex){
        this.age = age ;
        this.name = name;
        this.sex = sex ;
    }

    // get & set methods
    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
