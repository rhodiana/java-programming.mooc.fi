import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.equals("")) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title,pages,publicationYear));
        }
        
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        if(info.equals("everything")) {
            for(Book book:books){
                System.out.println(book);
            }
        }
        if(info.equals("name")) {
            for(Book book:books){
                System.out.println(book.getTitle());
            }
        }
    }
}
