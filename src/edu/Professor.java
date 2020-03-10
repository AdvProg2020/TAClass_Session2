package edu;

public class Professor {
    private String firstName;
    private String lastName;
    private String rank;

    public Professor(String firstName, String lastName, String rank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rank = rank;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
