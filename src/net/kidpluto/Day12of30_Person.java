package net.kidpluto;

/**
 * Created by Chris on 4/4/2017.
 * <p>
 * This class is given as part of the problem.
 */
public class Day12of30_Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Day12of30_Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }
}

