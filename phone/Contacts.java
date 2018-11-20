package oop.phone;


public class Contacts {
    private int number;
    private String firstName;
    private String lastName;


    public Contacts() {

    }

    public Contacts(int number) {
        this.number = number;
        this.firstName = "unknown";
        this.lastName = "unknown";
    }

    public Contacts(int number, String firstName, String lastName) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[" + firstName + " " + lastName + " number= " + number +']';
    }
}
