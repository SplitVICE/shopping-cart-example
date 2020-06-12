package Logic;

import Object.*;
import java.util.LinkedList;

public class Memory {

    // Lists of objects. Movies, books, and shoppingCartList.
    public static LinkedList<Book> booksList = new LinkedList<Book>();
    public static LinkedList<Movie> movieList = new LinkedList<Movie>();

    // Stores productIds. Go to Object - Product class for more information.
    public static LinkedList<String> shoppingCartList
            = new LinkedList<String>();

}
