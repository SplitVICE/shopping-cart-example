package Object;

public class Product {

    // Product id made with a prefix and an random number.
    // Prefixes are: mov for movie and boo for book.
    private String productId;
    private String name;
    private String productPath;
    private String year;

    public Product(String prefix) {
        productId = prefix + (int) (Math.random() * 100000);
    }

    public Product(String prefix, String name, String productPath, String year) {
        productId = prefix + (int) (Math.random() * 100000);
        this.name = name;
        this.productPath = productPath;
        this.year = year;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductPath() {
        return productPath;
    }

    public void setProductPath(String productPath) {
        this.productPath = productPath;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
