package ru.skypro;

public class Author {
    private String lastName;
    private String firstName;

    public Author (String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String toString() {
        return this.lastName + " " + this.firstName;
    }
}
