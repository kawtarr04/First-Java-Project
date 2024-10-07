package library;

public class LibraryTest {
    public static void main(String[] args){
        Book aBook = new Book("Lone Ranger and Tonto","Sherman Alexie");
        aBook.borrowBook();
        System.out.println(aBook.getBookInfo());
        aBook.returnBook();
    }
}
