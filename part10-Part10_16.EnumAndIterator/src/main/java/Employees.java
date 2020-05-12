
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cavitecity
 */
public class Employees {

    private List<Person> arr;

    public Employees() {
        arr = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        arr.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(person -> arr.add(person));
    }

    public void print() {
//        arr.forEach(person
//                -> {
//            System.out.println(person);
//        });
        Iterator<Person> iterate = arr.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next().toString());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterate = arr.iterator();
        while (iterate.hasNext()) {
            if (iterate.next().getEducation().equals(education)) {
                System.out.println(arr.toString());
            }

        }

//arr.stream()
//        .forEach(nat -> {
//            if(nat.getEducation().equals(education)){
//                System.out.println(nat.toString());
//            }
//        });

    }

    public void fire(Education education) {
        Iterator<Person> iterator = arr.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
