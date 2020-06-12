package Object;

public class Movie extends Product {

    private String rating;

    public Movie() {
        super("mov");
    }
    
    public Movie(String name, String productPath, String year) {
        super("mov", name, productPath, year);
    }

    @Override
    public String toString() {
        return "Movie{" + "rating=" + rating + '}' + super.getName() + super.getProductId();
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String getProductId() {
        return super.getProductId();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

}
