import java.util.List;

public class RemoveProfile {

    public void removeProfile(List<Profile> profiles) {

        System.out.println("-----Remove a profile----");
        // find
        List<Profile> foundProfiles = SearchProfile.searchProfile(profiles);

        // remove
        if (foundProfiles.size() > 0) {
            System.out.println("--------------------");
            int selectedProfileNo = Terminal.readInt("Enter the row number you want to remove:");
            profiles.remove(foundProfiles.get(selectedProfileNo - 1));
            System.out.println("profile is deleted.");
        }

    }

}



            