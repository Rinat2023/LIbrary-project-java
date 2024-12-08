import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Library {
    private String name;
    private String address;
    private int balance;
    private Book[] books;
    private Bron[] brons;
    private Client[] clients;

    public Library(String name, String address, int balance, Book[] books, Bron[] brons, Client[] clients) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.books = books;
        this.brons = brons;
        this.clients = clients;
    }

    public Library() {
    }

    // _____________посмотреть доступные книги - Нурис_______________
    public void showAviableBooks() {
        int count = 0;
        for (Book book : books) {
            if (book.isAvailable() == false) {
                System.out.println(count + ". " + book.getTitle());
                count++;
            }
        }
    }

    // _____________посмотреть занятые книги - Марсель______________-
    public void showBookedBooks() {
        int count = 0;
        for (Book book : books) {
            if (book.isAvailable() == true) {
                System.out.println(count + ". " + book.getTitle());
                count++;
            }
        }
    }

    // __________Забронировать книгу - Ринат_________________
    public String bronBook(int bookId, int clientId, LocalDate startDate, LocalDate endDate) {
        Client client = null;
        for (int i = 0; i < clients.length; i++) {
            if (clientId == i) {
                client = clients[i];
            }
            ;
        }
        Book book = null;
        for (int i = 0; i < books.length; i++) {
            if (bookId == i) {
                if (!books[i].isAvailable()) {
                    books[i].setAvailable(true);
                }
                book = books[i];
            }
        }
        Bron bronBook = new Bron(client, book, startDate, endDate, 0);
        Bron[] newBrons = Arrays.copyOf(brons, brons.length + 1);
        newBrons[newBrons.length - 1] = bronBook;
        brons = newBrons;
        return "Книга успешно забронировано";
    }

    // ____________Вернуть книгу - Алтынай___________
    public void returnBook(int bookId) {
        Bron findedBron = null;
        Bron[] newBrons = new Bron[brons.length - 1];
        for (int i = 0; i < brons.length; i++) {
            if (i == bookId) {
                findedBron = brons[i];
                continue;
            } else {
                newBrons[i] = brons[i];
            }
        }
        for (Book returnedBook : books){
            if (findedBron.getBook().getTitle().equals(returnedBook.getTitle()) ){
                returnedBook.setAvailable(false);
            }
        }
        if (findedBron.getEndDate().isAfter(LocalDate.now())){
            Period period = Period.between(findedBron.getEndDate(), LocalDate.now());
            for (Client client : clients){
                if (client.getFullName().equals(findedBron.getClient().getFullName())){
                   int clientBalance = client.getBalance();
                   client.setBalance(clientBalance - (period.getDays()) * 100);
                }
            }
        }
        brons = newBrons;
        System.out.println("Возврат книги прошла успешно");
    }


    // Выход - я

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Bron[] getBrons() {
        return brons;
    }

    public void setBrons(Bron[] brons) {
        this.brons = brons;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Library: " +
                "name='" + name + '\n' +
                "address='" + address + '\n' +
                "balance='" + balance + '\n' +
                "books=" + Arrays.toString(books) + '\n' +
                "brons=" + Arrays.toString(brons) + '\n' +
                "clients=" + Arrays.toString(clients);
    }
}
