import java.util.ArrayList;
import java.util.List;

public class Menu {

    final String ADMIN_PASSWORD = "p";

    User user;
    int selectedOption = -1;
    List<Profile> profiles = new ArrayList<>();
    AddProfile addProfile = new AddProfile();
    RemoveProfile removeProfile = new RemoveProfile();
    EditProfile editProfile = new EditProfile();

    public void displayMenu() {
        System.out.println("Please select user role");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.println("0. Exit");
        int userType = Integer.parseInt(Terminal.readText());
        switch (userType) {
            case 1:
                user = new Admin();
                System.out.println("Enter admin password");
                String adminPassword = Terminal.readText();
                if (adminPassword.equals(ADMIN_PASSWORD)) {
                    System.out.println("Successfully logged in as admin");
                    showMainMenu(user);
                } else {
                    System.out.println("Wrong password");
                    System.out.println("Access denied");
                }
            case 2:
                user = new Guest();
                showMainMenu(user);
                break;
        }
    }

    public void showMainMenu(User user) {
        while (selectedOption != 0) {
            System.out.println("\n====================================");
            System.out.println("Select one of the following options:");
            System.out.println("1- Show list of profiles");
            System.out.println("2- Search a profile");
            System.out.println("3- Add a profile");
            if (user.canModify()) {
                System.out.println("4- Modify a profiles");
            }
            if (user.canRemove()) {
                System.out.println("5- Remove a profile");
            }
            System.out.println("0- Exit");
            selectedOption = Integer.parseInt(Terminal.readText());
            switch (selectedOption) {
                case 1:
                    showListOfProfiles();
                    break;

                case 2:
                    SearchProfile.searchProfile(profiles);
                    break;

                case 3:
                    addProfile.addNewProfile(profiles);
                    break;

                case 4:
                    editProfile.editProfile(profiles);
                    break;

                case 5:
                    removeProfile.removeProfile(profiles);
                    break;

                case 6:
                    System.out.println("Exit");
                    break;

            }
        }
    }

    public void showListOfProfiles() {
        System.out.println("Showing list of profiles:");
        if (profiles.size() == 0) {
            System.out.println(" --List of profiles is currently empty--");
            Terminal.readText();
        } else {
            for (Profile profile : profiles) {
                System.out.println(profile);
            }
        }
    }

}
 
    
 
    
    

