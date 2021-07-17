
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int values = 0, sum =0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            if(number>0){
                values++;
                sum=sum+number;
            }
            
        }
        
        if(values==0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum/values;
            System.out.println(average);
        }

    }
}
