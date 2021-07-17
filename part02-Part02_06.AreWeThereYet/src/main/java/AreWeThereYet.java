
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give me a number:");
            String input = scanner.nextLine();
            if(input.equals("4")) {
                break;
            }
        }

    }
}
