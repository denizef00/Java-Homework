import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while(true){
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. List Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter command index: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1){
                System.out.println("Book Name: ");
                String bookName = scanner.nextLine();
                System.out.println("Author : ");
                String authorName = scanner.nextLine();
                library.addBook(bookName,authorName);
            } else if (choice == 2) {
                library.listBooks();
            } else if (choice == 3) {
                library.listBooks();
                System.out.println("Enter book index: ");
                int bookIndex = scanner.nextInt();
                if (bookIndex > library.getBooks().size() || bookIndex < 0){
                    System.out.println("Book index is not valid !!");
                } else{
                library.borrowBook(bookIndex);
                }
            } else if (choice == 4) {
                library.listBooks();
                System.out.println("Enter your book index number: ");
                int Index = scanner.nextInt();
                if (Index > library.getBooks().size() || Index < 0){
                    System.out.println("Book index is not valid !!");
                } else {
                    library.returnBook(Index);
                }
            } else if (choice == 5) {
                System.out.println("QUITED");
                break;
            } else {
                System.out.println("Invalid Command!!!!");
            }
        }
    }
}
