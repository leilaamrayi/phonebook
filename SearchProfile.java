import java.util.ArrayList;
import java.util.List;

public class SearchProfile {

    public static List<Profile> searchProfile(List<Profile> profiles) {
        List<Profile> foundProfiles = new ArrayList<>();
        int foundProfileCounter = 0;
        System.out.println("Select one of options to search a profile:");
        System.out.println(" 1- search by first name \n 2- Search by last name \n 3- Search by age \n 4- Search by phone number \n 5- Search by address \n 6- Free search \n 7- Exit");
        int item = Terminal.readInt();
        switch (item) {
            case 1 -> {
                String name = Terminal.readText("Enter the firstname:");
                for (Profile profile : profiles) {
                    if (containsCaseInsensitive(profile.getFirstName(), name)) {
                        foundProfileCounter++;
                        foundProfiles.add(profile);
                        System.out.println(foundProfileCounter + " - " + profile);
                    }
                }
            }
            case 2 -> {
                String lastName = Terminal.readText("Enter lastname:");
                for (Profile profile : profiles) {
                    if (containsCaseInsensitive(profile.getLastName(), lastName)) {
                        foundProfileCounter++;
                        foundProfiles.add(profile);
                        System.out.println(foundProfileCounter + " - " + profile);
                    }
                }
            }
            case 3 -> {
                int age = Terminal.readInt("Enter age:");
                for (Profile profile : profiles) {
                    if (age == (profile.getAge())) {
                        foundProfileCounter++;
                        foundProfiles.add(profile);
                        System.out.println(foundProfileCounter + " - " + profile);
                    }
                }
            }
            case 4 -> {
                String phoneNumber = Terminal.readText("Enter Phone number:");
                for (Profile profile : profiles) {
                    if (containsCaseInsensitive(profile.getPhones().toString(), phoneNumber)) {
                        foundProfileCounter++;
                        foundProfiles.add(profile);
                        System.out.println(foundProfileCounter + " - " + profile);
                    }
                }
            }
            case 5 -> {
                String address = Terminal.readText("Enter address:");
                for (Profile profile : profiles) {
                    if (containsCaseInsensitive(profile.getAddress().toString(), address)) {
                        foundProfileCounter++;
                        foundProfiles.add(profile);
                        System.out.println(foundProfileCounter + " - " + profile);
                    }
                }
            }
            case 6 -> {
                String freeKeyword = Terminal.readText("Free Search:");
                for (Profile profile : profiles) {
                    if (containsCaseInsensitive(profile.toString(), freeKeyword)) {
                        foundProfileCounter++;
                        foundProfiles.add(profile);
                        System.out.println(foundProfileCounter + " - " + profile);
                    }
                }
            }
            case 7 -> {
                return foundProfiles;
            }
        }
        if (foundProfiles.size() == 0) {
            System.out.println("\nNo profile found!\n");
        }
        return foundProfiles;
    }

    /**
     * Checks if 'mainString' contains 'searchString' regardless of the character case
     * @return true if it contains
     */
    private static boolean containsCaseInsensitive(String mainString, String searchString) {
        boolean result = mainString.toLowerCase().contains(searchString.toLowerCase());
        return result;
    }
}
 
