/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cavitecity
 */
public class Archive {

    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String toString() {
        return this.identifier + ": " + this.name;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Archive)) {
            return true;
        }

        Archive comparisonBook = (Archive) obj;

        return this.identifier.equals(comparisonBook.getIdentifier())
                ; //To change body of generated methods, choose Tools | Templates.
    }

}
