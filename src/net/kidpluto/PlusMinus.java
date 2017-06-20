package net.kidpluto;

/**
 * Created by Chris on 3/3/2017.
 */
public class PlusMinus {

    public static void main (String [] args) {

        float count = 6;

        float[] arr = new float[]{-4, 3, -9, 0, 4, 1};

        int pos = 0, zero = 0, neg = 0;

        for (int i = 0; i < count; i++) {
            if (arr[i] == 0) {
                zero++;
            } else {
                if (arr[i] > 0) {
                    pos++;
                } else {
                    neg++;
                }
            }
        }
        System.out.println("Pos [" + pos + "], Neg [" + neg + "], Zero [" + zero + "] ");

        // % of numbers which are positive
        if (pos == 0) {
            System.out.println("0");
        } else {
            System.out.println(pos / count);
        }
        // % of numbers which are negative
        if (neg == 0) {
            System.out.println("0");
        } else {
            System.out.println(neg / count);
        }
        // % of numbers which are zero
        if (zero == 0) {
            System.out.println("0");
        } else {
            System.out.println(zero / count);
        }
    }
}
