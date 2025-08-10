import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    int year;

    public Book(int id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;

    }
    public String toString(){
        return "ID: "+id+"\nTitle: "+title+"\nAuthor: "+author+"Year: "+year;
    }
}

    public class librarymanagement {

    static List<Book> books = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

        public static void main(String[] args){
            int choice;
            do {
                System.out.println("1. Add book");
                System.out.println("2. View all books");
                System.out.println("3. search book");
                System.out.println("4. Remove book id");
                System.out.println("5. Exit");
                System.out.println("Choose option");

                choice = input.nextInt();
                input.nextLine();

                switch (choice){
                    case 1 -> addBook();
                    case 2 -> viewBook();
                    case 3 -> searchBook();
                    case 4 -> removeBook();
                    case 5 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choise");

                }
            }while (choice !=5);
        }
        public static void addBook(){
            System.out.println("Enter book id:");
            int id = input.nextInt();
            input.nextLine();

            for(Book b:books){
                if (b.id == id){
                    System.out.println("Book alredy exits");
                    return;
                }
            }
            System.out.println("Enter title:");
            String title = input.nextLine();

            System.out.println("Enter author:");
            String author = input.nextLine();

            System.out.println("Enter year:");
            int year = input.nextInt();

            books.add(new Book(id,title,author,year));
            System.out.println("Book added successfully");
        }
        public static void viewBook() {
            if (books.isEmpty()) {
                System.out.println("no books in lib");
            } else {
                System.out.println("\n books in lib");
                for (Book b : books) {
                    System.out.println(b);
                }
            }
        }
        public static void searchBook(){
            System.out.println("Enter title to search");
            String title = input.nextLine();
            boolean found = false;

            for (Book b:books){
                if (b.title.equalsIgnoreCase(title)){
                    System.out.println("book found:\n"+b);
                    found = true;
                    break;
                }

            }
            if (!found){
                System.out.println("book not found");
            }
        }
        public static void removeBook(){
            System.out.println("Enter book id:");
            int id = input.nextInt();

            Book toRemove = null;
            for (Book b : books){
                if (b.id==id){
                    toRemove = b;
                    break;
                }
            }
            if (toRemove != null){
                books.remove(toRemove);
                System.out.println("book removed successfully");
            }else {
                System.out.println("book id not found");
            }
        }
}
