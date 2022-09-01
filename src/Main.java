import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> bookName = new TreeSet<>();

        Book book1 = new Book("The Lord of The Rings", 788);
        Book book2 = new Book("Harry Potter", 457);
        Book book3 = new Book("Game of Thrones", 678);
        Book book4 = new Book("Dance of the Dragons", 441);
        Book book5 = new Book("Silmarillion", 891);

        bookName.add(book1);
        bookName.add(book2);
        bookName.add(book3);
        bookName.add(book4);
        bookName.add(book5);

        for (Book booksName : bookName) {
            System.out.println("Book Name : " + booksName.getBookName() +
                    "\nBook Page : " + booksName.getPageNumber());
            System.out.println("###################");
        }
        System.out.println("--------- ############# -----------");


        TreeSet<Book> bookPage = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        bookPage.add(book1);
        bookPage.add(book2);
        bookPage.add(book3);
        bookPage.add(book4);
        bookPage.add(book5);

        for (Book booksPage : bookPage) {
            System.out.println("Book Name : " + booksPage.getBookName() +
                    "\nBook Page : " + booksPage.getPageNumber());
            System.out.println("###################");
        }
    }
}
