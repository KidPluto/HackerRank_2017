package net.kidpluto;

/**
 * Created by Chris on 4/7/2017.
 *
 * https://www.hackerrank.com/challenges/30-abstract-classes
 */
public class Day13of30_main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String title = scanner.nextLine();
//        String author = scanner.nextLine();
//        int price = scanner.nextInt();
//        scanner.close();
        String title = new String("The Alchemist");
        String author = new String("Paulo Coelho");
        int price = 248;

        Day13of30_Book book = new Day13of30_MyBook(title, author, price);
        book.display();
    }
}