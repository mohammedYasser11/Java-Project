
package project;

import java.util.Scanner;
public class LibrarySystem{


    private  Book[] books = new Book[1000];
    private Librarian[] librarians= new Librarian[500];
     private Reader[] readers= new Reader[500];
    private static int sizeb=0;
    
    int z=0;

    public LibrarySystem(){
         librarians[0] = new Librarian(1,1093553466,"t30067338o","librarian","omar","gomaa","ffg","omarbayom3006",false);
         
    }
    Scanner scanner = new Scanner(System.in);
   
    public void login(String email ,String pass , String Type ){
//         String type = scanner.next();
         
        if(Type.equalsIgnoreCase("l"))
         {
             for(int i =0;i<=librarians.length;i++ ){
             if( librarians[i].getEmail().equals(email) && librarians[i].getPassword().equals(pass)){

                 break;     
             }
             }
         }
        
        else if(Type.equalsIgnoreCase("r")){
             for(int i =0; i<=readers.length ;i++ ){
                if( readers[i].getEmail().equals(email) && readers[i].getPassword().equals(pass)){

                 break; 
            
                }
             }
        }
    }
//        public void Add_person(){
//        System.out.println("Please choose the type (1/2) ");
//        System.out.println("1 - Librarian ");
//        System.out.println("2 - Reader ");
//         int type1 = scanner.nextInt();
//         switch(type1){
//        
//            case 1 :
//                addperson("Librarian");
//                break;
//            case 2 :
//                addperson("reader");
//                break;
//                
//            default:
//                System.out.println("please reenter the number  ");
//                this.Add_person();
//        }
//        
//        
//        
//        }

    public void ADD_BOOK() {
        if (sizeb == books.length) {
            System.out.println("The library is full and cannot accept any more books.");
            return;
        }
         
        System.out.println("Enter the book name:");
        String name = scanner.nextLine();
        System.out.println("Enter the book author:");
        String author = scanner.nextLine();
        System.out.println("Enter the book ISBN:");
        int ISBN = scanner.nextInt();
        System.out.println("Enter the book category:");
        String category = scanner.nextLine();


        Book book = new Book(ISBN,name, author, category );
        books[sizeb] = book;
        sizeb++;
        System.out.println("The book "  + " is\" " + book.name_getter() + "\" has been added to the library.");

    }

    public void REMOVE_BOOK() {
              
        System.out.println("Enter the ISBN of the book to be removed:");
        int isbn = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < sizeb; i++) {
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
        for (int i = index; i < sizeb - 1; i++) {
            books[i] = books[i + 1];
        }
        sizeb--;
    
   
    }
     public void BOOK_SEARCH() {
               
        System.out.println("Enter a search term:");
        int searchTerm = scanner.nextInt();

        int matches = 0;
        for (int i = 0; i < sizeb; i++) {
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
//     public void addperson(String type){
//     
//        System.out.println("Enter the password:");
//        String password = scanner.next();
//        System.out.println("Enter the name:");
//        String first_name = scanner.next();
//        System.out.println("Enter the last name:");
//        String last_name = scanner.next();
//        System.out.println("Enter the address:");
//        String address = scanner.next();
//        System.out.println("Enter the email:");
//        String email = scanner.next();
//        System.out.println("Enter the id:");
//        int id = scanner.nextInt();
//        System.out.println("Enter the cellphone:");
//        long cellphone = scanner.nextLong();
//        if(type.equalsIgnoreCase("Librarian")){
//         Librarian l = new Librarian(id,cellphone,password,"librarian",first_name,last_name,address,email,false);
//               librarians [sizel]= l;
//                sizel++;}
//       
        
//     }
//     public void removeperson(){
//      System.out.println("Enter the type(Librarian / reader):");
//      String type = scanner.nextLine();
//      System.out.println("Enter the id");
//      int id = scanner.nextInt();
//      int index = -1;
//      if(type.equalsIgnoreCase("Librarian")){
//      for (int i = 0; i <= sizel ; i++) {
//            if(librarians [i].getId() == id){
//                index =i;
//                break;
//            } 
//        }
//      if (index == -1) {
//            System.out.println("No User found with id " + id + ".");
//            return;
//        }
//
//        System.out.println("The User \"" + librarians[index].getFirst_name()+librarians[index].getLast_name() + "\" has been removed from the library.");
//        for (int i = index; i < sizel - 1; i++) {
//            librarians[i] = librarians[i + 1];
//        }
//        sizel--;
//      
//      
//      }else if(type.equalsIgnoreCase("Reader")){
//         
//     }else{
//          System.out.println("There is no user with this id would you try again(y/n) " );
//         String try1 = scanner.nextLine();
//         if(try1.equalsIgnoreCase("y")){
//         removeperson();
//         }else{
//         
//         }
//         
//      }
//      }
     public void search(){
     System.out.println("Enter an id:");
        int id = scanner.nextInt();

        int matches = 0;
//        for (int i = 0; i < sizel; i++) {
//            if (librarians[i].getId()==id ) {
//                System.out.println( "the user you search for "+librarians[i].getFirst_name()+" "+librarians[i].getLast_name());
//                matches++;
//            }
//        }

        if (matches == 0) {
            System.out.println(  "No person found with this Id \"" + id + "\".");
        } else {
            System.out.println(  " user found matching the search id \"" + id + "\".");
        }
     
     }
     public void block(){
     System.out.println("please enter the id");
     int id = scanner.nextInt();
     
     }
     }







    
   

   