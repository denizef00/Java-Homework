import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(String bookName , String authorName){
        books.add(new Book(bookName,authorName));
        System.out.println("Book added : " + bookName);
    }

    public void listBooks(){
        if (books.isEmpty()){
            System.out.println("Library is empty!!");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.print((i+1) + ". " );
                books.get(i).displayInfo();
            }
        }
    }

    public void borrowBook(int index){
        if(index >= 1 && index <= books.size()){
            books.get(index - 1).borrowBook();
        } else{
            System.out.println("Invalid command!!");
        }
    }

    public void returnBook(int index){
        if(index >= 1 && index <= books.size()){
            books.get(index - 1).returnBook();
        } else{
            System.out.println("Invalid command!!");
        }
    }
}
