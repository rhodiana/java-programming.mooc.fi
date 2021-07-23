
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        String keyword = scanner.nextLine();
        boolean found = list.contains(keyword);
        if(found){
            System.out.println(keyword + " was found!");
        } else {
            System.out.println(keyword + " was not found!");
        }

    }
}
