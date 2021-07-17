
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int endingNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int startingNumber = Integer.valueOf(scanner.nextLine());
        for (int i=startingNumber;i<=endingNumber;i++){
            System.out.println(i);
        }
    }
}
