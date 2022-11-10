import java.util.List;
public class AddProfile {


    public void addNewProfile(List<Profile> profiles) {
        System.out.println("----Add a profile----");
        String firstName = Terminal.readText("Enter first name :");
        String lastName = Terminal.readText("Enter last name :");

        int age = Integer.parseInt(Terminal.readText("Enter age:"));
        System.out.println("Enter phone numbers (multiple possible), and hit ENTER when you're done:");
        List<String> phones = Terminal.readTextList("Enter Phone:");
        Address address = getAddressFromUser();
        Profile newProfile = new Profile(firstName, lastName, age, phones, address);
        profiles.add(newProfile);
        System.out.println("---New profile is added---");
        System.out.println(newProfile.toString());
    }


    public Address getAddressFromUser() {
        String postalCode = Terminal.readText("Enter postalcode:");
        String street = Terminal.readText("Enter street:");
        String city = Terminal.readText("Enter city:");
        String country = Terminal.readText("Enter country:");
        Address address = new Address(postalCode, street, city, country);
        return address;
    }



}
        