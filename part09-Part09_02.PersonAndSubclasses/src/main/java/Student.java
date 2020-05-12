/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cavitecity
 */
public class Student extends Person {

    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = credits;
        this.credits = 0;
    }

    public void study() {
        credits++;
    }

    public int credits() {
        return this.credits;
    }

    @Override
    public String toString() {
        return super.getName() + "\n" 
                + "  " + super.getAddress() + 
                "\n" + "  " + "Study credits " + credits; //To change body of generated methods, choose Tools | Templates.
    }

}
