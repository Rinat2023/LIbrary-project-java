import java.time.LocalDate;

public class Bron {
    private Client client;
    private Book book;
    private LocalDate startDate;
    private LocalDate endDate;
    private int penalty;

    public Bron() {
    }

    public Bron(Client client, Book book, LocalDate startDate, LocalDate endDate, int penalty) {
        this.client = client;
        this.book = book;
        this.startDate = startDate;
        this.endDate = endDate;
        this.penalty = penalty;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    @Override
    public String toString() {
        return "Bron: " + '\n' +
                "client=" + client + '\n' +
                "book=" + book + '\n' +
                "startDate=" + startDate + '\n' +
                "endDate=" + endDate + '\n' +
                "penalty=" + penalty;
    }
}
