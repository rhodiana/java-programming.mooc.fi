
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0, numbers = 0, even = 0, odd = 0;
        double mean = 0;
        while(true) {
            System.out.println("Give numbers:");
            int number  = Integer.valueOf(scanner.nextLine());
            
            if(number == -1){
                break;
            }
            if(number%2==0) {
                even++;
            } else {
                odd++;
            }
            sum+=number;
            numbers++;
        }
        mean = (double) sum/numbers;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + mean);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}