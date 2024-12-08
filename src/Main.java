import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //_______________books_____________________
        Book Math = new Book("Math", "Rinat", 300, "Learning", LocalDate.of(1999, 12, 3), false);
        Book History = new Book("History", "Rinat", 566, "Learning", LocalDate.of(1999, 12, 3), false);
        Book Chemistry = new Book("Chemistry", "Rinat", 499, "Learning", LocalDate.of(1999, 12, 3), false);
        Book Geography = new Book("Geography", "Rinat", 111, "Learning", LocalDate.of(1999, 12, 3), false);
        Book Phisics = new Book("Phisics", "Rinat", 400, "Learning", LocalDate.of(1999, 12, 3), false);
        Book Literature = new Book("Literature", "Rinat", 1000, "Learning", LocalDate.of(1999, 12, 3), false);

        Book[] books = {Math, History, Chemistry, Geography, Phisics, Literature};

        //_______________clients__________________
        Client Rinat = new Client("Rinat", 20, 1000);
        Client Elzar = new Client("Elzar", 20, 1000);
        Client Marsel = new Client("Marsel", 20, 1000);

        Client[] clients = {Rinat, Elzar, Marsel};

        //_____________Library_____________
        Library MetaLibrary = new Library("MetaLibrary", "Gorkogo_97", 1000000, books, new Bron[0], clients);

        //________________MENU_____________________
        Scanner scanner = new Scanner(System.in);
        int choose = 0;
        while (choose != 5) {
            getMenu();
            choose = scanner.nextInt();
            switch (choose) {
                case 1: {
                    MetaLibrary.showAviableBooks();
                    break;
                }
                case 2: {
                    MetaLibrary.showBookedBooks();
                    break;
                }
                case 3: {
                    System.out.println("Каким клиентом вы являетесь?");
                    getClient(clients);
                    int numOfClient = scanner.nextInt();
                    System.out.println("Выберите книгу");
                    getBooks(books);
                    int numOfBook = scanner.nextInt();
                    System.out.println("До какого числа будете бронировать книгу?");
                    System.out.println("Год: ");
                    int year = scanner.nextInt();
                    System.out.println("Месяц: ");
                    int month = scanner.nextInt();
                    System.out.println("День: ");
                    int day = scanner.nextInt();
                    System.out.println(MetaLibrary.bronBook(numOfBook, numOfClient, LocalDate.now(), LocalDate.of(year, month, day)));
                    break;
                }
                case 4:{
                    System.out.println("Какую книгу вы бронировали?");
                    MetaLibrary.showBookedBooks();
                    int bookNum = scanner.nextInt();
                    MetaLibrary.returnBook(bookNum);
                    break;
                }
            }
        }
    }

    public static void getMenu() {
        System.out.println("Выберите действие:");
        System.out.println("(1) Посмотреть список всех доступных книг");
        System.out.println("(2) Посмотреть список всех занятых книг");
        System.out.println("(3) Забронировать книгу");
        System.out.println("(4) Вернуть книгу");
        System.out.println("(5) Выйти");
    }

    public static void getBooks(Book[] books) {
        int count = 0;
        for (Book book : books) {
            System.out.println(count + ". " + book.getTitle());
            count++;
        }
    }

    public static void getClient(Client[] clients) {
        int count = 0;
        for (Client client : clients) {
            System.out.println(count + ". " + client.getFullName());
            count++;
        }
    }
}