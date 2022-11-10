import java.util.List;

public class EditProfile {
    AddProfile add = new AddProfile();

    public void editProfile(List<Profile> profiles) {

        System.out.println("-----Edit a profile----");
        // find
        List<Profile> foundProfiles = SearchProfile.searchProfile(profiles);

        // remove
        if (foundProfiles.size() > 0) {
            System.out.println("--------------------");
            int selectedProfileNo = Terminal.readInt("Enter the row number you want to remove:");
            updateProfile(foundProfiles.get(selectedProfileNo-1));
        }

    }

    private void updateProfile(Profile profile) {
        System.out.println("Modifying profile: "+profile);
        System.out.println("Enter new value, or just hit ENTER key if you don't want to change.");

        // String firstName = Terminal.readText(String.format("Enter first name (%s):",profile.getFirstName()));

        String firstName = Terminal.readText("Enter first name:");
        if (!firstName.equals("")) {
            profile.setFirstName(firstName);
        }

        String lastName = Terminal.readText("Enter last name:");
        if (!lastName.equals("")) {
            profile.setLastName(lastName);
        }

        int age = Terminal.readInt("Enter age:");
        if (age != 0) {
            profile.setAge(age);
        }

        System.out.println("Enter phone numbers (multiple possible), and hit ENTER when you're done:");
        List<String> phones = Terminal.readTextList("Enter phone number:");
        if (phones.size() > 0) {
            profile.setPhones(phones);
        }
        mergeAddress(profile.getAddress(), add.getAddressFromUser());
        System.out.println(profile);
    }

    public void mergeAddress(Address currentAdd, Address newAdd) {

        if (notEmpty(newAdd.getPostalCode())) {
            currentAdd.setPostalCode(newAdd.getPostalCode());
        }
        if (notEmpty(newAdd.getStreet())) {
            currentAdd.setStreet(newAdd.getStreet());
        }

        if (notEmpty(newAdd.getCity())) {
            currentAdd.setCity(newAdd.getCity());
        }
        if (notEmpty(newAdd.getCountry())) {
            currentAdd.setCountry(newAdd.getCountry());
        }

    }

    public boolean notEmpty(String value) {
        return value != null && !value.equals("");
    }

}
           