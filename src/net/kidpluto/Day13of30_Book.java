package net.kidpluto;

/**
 * Created by Chris on 4/7/2017.
 *
 * This class given as part of the problem.
 */
abstract class Day13of30_Book {
    String title;
    String author;

    Day13of30_Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    abstract void display();
}
