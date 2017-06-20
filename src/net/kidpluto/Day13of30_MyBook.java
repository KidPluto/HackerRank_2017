package net.kidpluto;

/**
 * Created by Chris on 4/7/2017.
 */
class Day13of30_MyBook extends Day13of30_Book  {

    private int price;

    public Day13of30_MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
