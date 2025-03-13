import java.util.ArrayList;
import java.util.List;
public class Book {
    String title;
    String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book [Title=" + title + ", Author=" + author +"]";
    }
}

class Library {
    private List<Book> books;
    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
class Member {
    String name;
    Library library;

    public Member(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    public void borrowBook(Book book) {
        System.out.println(name + " borrowed " + book.title);
    }

    public void returnBook(Book book) {
        System.out.println(name + " returned " + book.title);
    }
}

class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in Library:");
        library.displayBooks();

        Member member = new Member("Alice", library);
        member.borrowBook(book1);
        member.returnBook(book1);
    }
}
