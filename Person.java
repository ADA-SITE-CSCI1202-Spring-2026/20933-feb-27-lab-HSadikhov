public class Person {
    
    private String firstName;
    private String lastName;
    private String gender;

    public Person() {
    }

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public boolean equals(Person p) {
        if (this == p) {
            return true;
        }
        if (p == null) {
            return false;
        }
        return java.util.Objects.equals(this.firstName, p.firstName) &&
               java.util.Objects.equals(this.lastName, p.lastName) &&
               java.util.Objects.equals(this.gender, p.gender);
    }
}