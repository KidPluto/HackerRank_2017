package net.kidpluto;

/**
 * Created by Chris on 3/13/2017.
 *
 *
 */
public class Day02of30 {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        double mealCost = scan.nextDouble(); // original meal price
//        int tipPercent = scan.nextInt(); // tip percentage
//        int taxPercent = scan.nextInt(); // tax percentage
//        scan.close();

        double mealCost = 12;
        int tipPercent = 20;
        int taxPercent = 8;

        // Write your calculation code here.
        double tip = tipPercent / 100.0;
        double tax = taxPercent / 100.0;
        double tmp = mealCost + (tip*mealCost) + (tax*mealCost);

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(tmp);

        // Print your result
        System.out.println("The total cost of the meal is " + totalCost + " dollars");
    }
}
