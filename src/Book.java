import java.time.LocalDate;

public class Book {
    private String title;
    private String author;
    private int pageCount;
    private String genre;
    private LocalDate publishDate;
    private boolean available;

    public Book(String title, String author, int pageCount, String genre, LocalDate publishDate, boolean available) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genre = genre;
        this.publishDate = publishDate;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book : " +
                " title='" + title + '\n' +
                " author='" + author + '\n' +
                " pageCount=" + pageCount +
                " genre='" + genre + '\n' +
                " publishDate=" + publishDate + '\n' +
                " available=" + available + '\n' ;
    }
}
