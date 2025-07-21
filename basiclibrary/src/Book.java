public class Book {
    private final String bookName;
    private final String authorName;
    private boolean isBorrowed;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isBorrowed = false;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook(){
        if (!isBorrowed){
            isBorrowed = true;
            System.out.println("Borrow this book: " + bookName);
        } else {
            System.out.println("This book already taken: " + bookName);
        }
    }

    public void returnBook(){
        if (isBorrowed){
            isBorrowed = false;
            System.out.println("Return this book: " + bookName);
        } else {
            System.out.println("This book is not borrowed: " + bookName);
        }
    }

    public void displayInfo(){
        System.out.println("Book: " + bookName + " | Author: " + authorName + " | Case: " + (isBorrowed ? "Already taken" : "Available") );
    }
}
