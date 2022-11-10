import java.util.List;

public class Profile {
    private String firstName;
    private String lastName;

    private List<String> phones;
    private int age;
    Address address;

    public Profile(){

    }

    public Profile(String firstName, String lastName, int age, List<String> phones, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phones = phones;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return ("firstname: " + firstName + "  lastname: " + lastName + "   age: " + age + "  phones: " + phones + " " + address);
    }


}
