
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cavitecity
 */
public class Hand {

    private List<Card> arr;

    public Hand() {
        arr = new ArrayList<>();
    }

    public void add(Card card) {
        arr.add(card);
    }

    public void print() {
        arr.stream()
                .forEach(nat -> System.out.println(nat.toString()));
    }

    public void sort() {
        arr.stream()
                .sorted()
                .collect(Collectors.toList())
                .forEach(nat -> System.out.println(nat.toString()));

    }

    @Override
    public int compareTo(Hand o) {
        int total = 0;
        int total2 = 0;
        total =1 arr.stream().map((x) -> x.getValue()).reduce(total, Integer::sum);
        total2 = o.arr.stream().map((y) -> y.getValue()).reduce(total2, Integer::sum);

        return total-total2;
    }
}
