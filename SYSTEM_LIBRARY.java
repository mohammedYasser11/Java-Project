
/**
 *
 * @author Sara Ashour
 */

import java.util.Scanner;
public class SYSTEM_LIBRARY{

    private Book[] books;
    private int size;

    public SYSTEM_LIBRARY(){
        books = new Book[200];
        size = 0;
    }

    public void ADD_BOOK() {
        if (size == books.length) {
            System.out.println("The library is full and cannot accept any more books.");
            return;
        }
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book name:");
        String name = scanner.next();
        System.out.println("Enter the book author:");
        String author = scanner.next();
        System.out.println("Enter the book ISBN:");
        int ISBN = scanner.nextInt();
        System.out.println("Enter the book category:");
        String category = scanner.next();
        scanner.nextLine(); 

        Book book = new Book(ISBN,name, author, category );
        books[size] = book;
        size++;
        System.out.println("The book "  + " is\" " + book.name_getter() + "\" has been added to the library.");

    }

    public void REMOVE_BOOK() {
               Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ISBN of the book to be removed:");
        int isbn = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].ISBN_getter()==isbn) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("No book found with ISBN " + isbn + ".");
            return;
        }

        System.out.println("The book \"" + books[index].name_getter() + "\" has been removed from the library.");
        for (int i = index; i < size - 1; i++) {
            books[i] = books[i + 1];
        }
        size--;
    
   
    }
     public void BOOK_SEARCH() {
                Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a search term:");
        int searchTerm = scanner.nextInt();

        int matches = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].ISBN_getter()==searchTerm ) {
                System.out.println(  books[i].name_getter() + " book is " + books[i].category_getter() +" and is written by " + books[i].author_getter() + " with ISBN " + books[i].ISBN_getter() +".");
                matches++;
            }
        }

        if (matches == 0) {
            System.out.println(  "No books found with this ISBN \"" + searchTerm + "\".");
        } else {
            System.out.println(  " book found matching the search term \"" + searchTerm + "\".");
        }
    }
}






    
   

   