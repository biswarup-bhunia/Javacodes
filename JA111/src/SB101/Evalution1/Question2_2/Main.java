package SB101.Evalution1.Question2_2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Library l = new Library();

        Scanner sc = new Scanner(System.in);
        try {
            while (true) {

                System.out.println("1.Add Book");
                System.out.println("2.Display all book details");
                System.out.println("3.Search Book by author");
                System.out.println("4.Search book by ISBN");
                System.out.println("5.Exit");
                System.out.println("Enter your choice:");
                int num = sc.nextInt();
                if (num == 1) {
                    System.out.println("Enter the isbn no:");
                    int no = sc.nextInt();
                    System.out.println("Enter the book name:");
                    String name = sc.next();
                    System.out.println("Enter the author name:");
                    sc.nextLine();
                    String author = sc.nextLine();
                    try {
                        l.addBook(new Book(no, name, author));
                    } catch (BookException be) {
                        // TODO: handle exception
                        System.out.println(be.getMessage());

                    }
                } else if (num == 2) {

                    try {
                        List<Book> b = l.viewAllBooks();
                        b.forEach(s -> {
                            System.out.println("ISBN no is: " + s.getIsbn());
                            System.out.println("Book name is: " + s.getBookName());
                            System.out.println("Author name is: " + s.getAuthor());
                        });

                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }
                } else if (num == 3) {

                    System.out.println("Enter the author name:");
                    sc.nextLine();
                    String AuthorName = sc.nextLine();
                    try {
                        List<Book> ans = l.viewBooksByAuthor(AuthorName);

                        ans.forEach(s -> {
                            System.out.println("ISBN no is: " + s.getIsbn());
                            System.out.println("Book name is: " + s.getBookName());
                            System.out.println("Author name is: " + s.getAuthor());
                        });
                    } catch (BookException bes) {
                        // TODO: handle exception
                        System.out.println(bes.getMessage());
                    }
                } else if (num == 4) {
                    System.out.println("Enter by ISBN");
                    int isbn = sc.nextInt();

                    try {
                        System.out.println(l.getBookByISBN(isbn));
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println(e.getMessage());
                    }
                } else {
                    break;
                }

            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Please enter right input");
        }

    }
}
