
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int ageSum = 0, multitude = 0;
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String data[] = input.split(",");
            if(longestName.length()<data[0].length()){
                longestName = data[0];
            }
            ageSum+=Integer.valueOf(data[1]);
            multitude++;
        }
        double ageAverage = 1.0 * ageSum / multitude;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ageAverage);
    }
}
