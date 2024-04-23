
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            Integer pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication Year:");
            Integer year = Integer.parseInt(scanner.nextLine());
            books.add(new Book(title, pages, year));

        }
        System.out.println();
        System.out.println("What information do you want to print?");
        String printThis = scanner.nextLine();
        for (Book book : books) {
            if (printThis.equals("name")) {
                System.out.println(book.getName());
            } else if (printThis.equals("everything")) {
                System.out.println(book.toString());
            }
        }
        scanner.close();
    }
}
