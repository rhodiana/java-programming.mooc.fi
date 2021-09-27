
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<Item>();

        while(true){
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if(id.isEmpty())
                break;
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty())
                break;
            Item anItem = new Item(id,name);
            boolean exists=false;
            for(Item item:items) {
                if(anItem.equals(item))
                    exists=true;
            }
            if(!exists)
                items.add(anItem);
        }
        
        System.out.println("==Items==");
        for(Item item:items) {
            System.out.println(item.getId() + ": " + item.getName());
        }
    }
}
