package Logic;

import Object.*;

public class Tasks {

    // Runs the application.
    public void run() {
        createData();
        printAllData();
        printShoppingCartContent();
        printShoppingCartContent_itemContent();
    }

    // Creates books and movies and stores it inside the memory lists.
    private void createData() {
        Book tempBook;
        for (int i = 0; i < 10; i++) {
            tempBook = new Book("Book" + i, "Path" + i, "2020");
            Memory.booksList.add(tempBook);
            if (i == 7) {
                Memory.shoppingCartList.add(tempBook.getProductId());
            }
        }
        for (int i = 0; i < 15; i++) {
            Memory.movieList.add(new Movie("Movie" + i, "Path" + i, "2020"));
        }
    }

    // Print all the stored data in memory.
    private void printAllData() {
        for (int i = 0; i < Memory.booksList.size(); i++) {
            System.out.println(Memory.booksList.get(i));
        }

        for (int i = 0; i < Memory.movieList.size(); i++) {
            System.out.println(Memory.movieList.get(i));
        }
    }

    // Prints the productId stored in the memory shoppingCartList list.
    private void printShoppingCartContent() {
        System.out.println("Shopping list---");
        for (int i = 0; i < Memory.shoppingCartList.size(); i++) {
            System.out.println(Memory.shoppingCartList.get(i));
        }
    }

    // Prints the products content stored in the memory shoppingCartList list.
    private void printShoppingCartContent_itemContent() {
        System.out.println("Shopping list products specs---");
        for (int i = 0; i < Memory.shoppingCartList.size(); i++) {
            String productId = Memory.shoppingCartList.get(i);
            String prefix = subtractPrefix(productId);
            switch (prefix) {
                case "boo":
                    for (int j = 0; j < Memory.booksList.size(); j++) {
                        if (Memory.booksList.get(j).getProductId().equals(productId)) {
                            System.out.println("Product in cart: " + Memory.booksList.get(j).toString());
                        }
                    }
                    break;
                case "mov":
                    for (int n = 0; n < Memory.movieList.size(); n++) {
                        if (Memory.movieList.get(i).getProductId().equals(productId)) {
                            System.out.println("Product in cart: " + Memory.movieList.get(i).toString());
                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    // Subtracts the prefix from a product id.
    private String subtractPrefix(String item) {
        StringBuilder stringBuilder = new StringBuilder(item);
        String prefix = "";
        for (int i = 0; i < 3; i++) {
            prefix += stringBuilder.charAt(0);
            stringBuilder.deleteCharAt(0);
        }
        return prefix;
    }

}
