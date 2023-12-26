package lab_7;
import lab_7.Wrapper;
import lab_7.Book;
public class Main
{
    public static void main(String[] args) {
        Book book_1 = new Book("The Alchemist", 1988, "Paulo Coelho", "Fantasy");
        Book book_2 = new Book("Norwegian Wood", 1987, "Haruki Murakami", "Novel");

        book_1.print();
        book_2.print();

        Wrapper<Book> Wbook_1 = new Wrapper<>(book_1);
        Wrapper<Book> Wbook_2 = new Wrapper<>(book_2);

        Wbook_1.swap(Wbook_2);
        book_1 = Wbook_1.getData();
        book_2 = Wbook_2.getData();

        book_1.print();
        book_2.print();

    }
}
