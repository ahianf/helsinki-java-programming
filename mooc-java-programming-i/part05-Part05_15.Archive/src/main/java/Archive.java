/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahian
 */
public class Archive {

    private String name;
    private String identifier;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same place, they are the same.
        if (this == compared) {
            return true;
        }

        // if the object is not instance of Book, the objects are not the same
        if (!(compared instanceof Archive)) {
            return false;
        }

        // cast the object to Book
        Archive libroAComparar = (Archive) compared;

        // if the object's values are the same, the objects are the same
        if (this.identifier.equals(libroAComparar.identifier)) {
            return true;
        }

        // other wise, the objects are not the same
        return false;
    }

    public String toString() {
        return identifier + ": " + name;
    }
}
