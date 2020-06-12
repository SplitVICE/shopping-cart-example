package Object;

public class Book extends Product {

    private String author;

    public Book() {
        super("boo");
    }

    public Book(String name, String productPath, String year) {
        super("boo", name, productPath, year);
    }

    @Override
    public String toString() {
        return "Book{" + "author=" + author + '}' + super.getName()
                + " " + super.getProductId();
    }

    @Override
    public String getProductId() {
        return super.getProductId();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
