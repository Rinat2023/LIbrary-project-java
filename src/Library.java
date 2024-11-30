import java.util.Arrays;

public class Library {
    private String name;
    private String address;
    private String balance;
    private Book[] books;
    private Bron[] brons;
    private Client[] clients;

    public Library(String name, String address, String balance, Book[] books, Bron[] brons, Client[] clients) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.books = books;
        this.brons = brons;
        this.clients = clients;
    }

    public Library() {
    }

    // посмотреть доступные книги - Нурис
    // посмотреть занятые книги - Марсель
    // Забронировать книгу - Ринат
    // Вернуть книгу - Алтынай
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

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
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
                "address='" + address +  '\n' +
                "balance='" + balance +  '\n' +
                "books=" + Arrays.toString(books) +  '\n' +
                "brons=" + Arrays.toString(brons) +  '\n' +
                "clients=" + Arrays.toString(clients) ;
    }
}
