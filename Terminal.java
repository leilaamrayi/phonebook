import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Terminal {

    static Scanner scanner = new Scanner(System.in);

    public static String readText(){
        return scanner.nextLine();
    }

    public static String readText(String message){
        System.out.print(message+" ");
        return readText();
    }

    public static List<String> readTextList(String message){
        List<String> list = new ArrayList<>();
        String input;
        do {
            System.out.print(message+" ");
            input = readText();
            list.add(input);
        } while (!"".equals(input));
        return list;
    }

    public static int readInt(){
        int value = 0;

        try {
            value = Integer.parseInt(readText());
        } catch (NumberFormatException e){}

        return value;
    }

    public static int readInt(String message){
        System.out.print(message+" ");
        return readInt();
    }

}
