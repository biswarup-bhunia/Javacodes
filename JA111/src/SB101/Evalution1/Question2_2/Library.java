package SB101.Evalution1.Question2_2;
import java.util.*;
import java.util.stream.Collectors;
public class Library {
    List<Book> listOfbook = new ArrayList<>();

    void addBook(Book book) throws BookException {

        for (Book b1 : listOfbook) {

            if (b1.getIsbn() == book.getIsbn() && b1.getAuthor().equals(book.getAuthor()) && b1.getBookName().equals(book.getBookName())) {
                throw new BookException("Book already exist.");
            }
        }
        listOfbook.add(book);
        System.out.println("Book addition successful");

    }

    List viewAllBooks() throws BookException {

        if (listOfbook.size() == 0) {
            throw new BookException("No book present in the library.");
        } else {
            listOfbook.sort((o1, o2) -> o1.getBookName().compareToIgnoreCase(o2.getBookName()));
            return listOfbook;
        }

    }

    List viewBooksByAuthor(String author) throws BookException {

        List<Book> bookFilter = listOfbook.stream().filter(s -> s.getAuthor().equals(author)).collect(Collectors.toList());

        if (bookFilter.size() == 0) {
            throw new BookException("No book publish by the author Henry");
        } else {
            return bookFilter;
        }

    }

    Book getBookByISBN(int isbn) throws BookException {

        for (Book book : listOfbook) {

            if (book.getIsbn() == isbn) {
                return book;
            }

        }

        throw new BookException("This isbn is wrong, there is no book on this number.");

    }
}
