package validating;

public class Person {

    private String name;
    private int age;
    private Object o;
    public Person(String name, int age) {

        if ((name == null) || (name.isEmpty()) || (name.length() > 40)) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }

        if ((age < 0) || (age > 120)) {
            throw new IllegalArgumentException();
        } else {
            this.age = age;
        }
        
    }
    
    

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
