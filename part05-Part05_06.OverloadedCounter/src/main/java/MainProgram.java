
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter testing = new Counter(10);
        
        testing.decrease();
        testing.increase(3);
        testing.decrease(30);
        testing.increase(-30);
        
        System.out.println(testing.value());
        
    }
}
