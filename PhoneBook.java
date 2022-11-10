import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneBook {

    public static void main(String[] args) {

        Menu start = new Menu();
        //
        start.profiles = testProfiles();
        //
        start.displayMenu();
    }


    private static List<Profile> testProfiles() {
        List<Profile> list = new ArrayList<>();

        list.add(new Profile("Leila","Amrayi Asl",40, List.of("076123456" , "09123637800"),
                new Address("41726","Toleredsgatan 20A", "Goteborg", "Sweden")));

        list.add(new Profile("Alex","Ramsey",54, List.of("073123456" , "09193537800"),
                new Address("12345","A strange place 22", "Copenhagen", "Denmark")));

        list.add(new Profile("Pooria","Amrayi",30, List.of("073134569" , "09183237800"),
                new Address("54321","Amrayigatan 12", "Karaj", "Iran")));

        return list;

    }

}
