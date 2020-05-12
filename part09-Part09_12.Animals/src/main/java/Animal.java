/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cavitecity
 */
public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(this.name + " eats");
    }

    void sleep() {
        System.out.println(this.name + " sleeps");
    }

    String getName() {
        return this.name;
    }

}
