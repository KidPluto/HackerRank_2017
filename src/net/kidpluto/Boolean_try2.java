package net.kidpluto;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by Chris on 3/4/2017.
 */
public class Boolean_try2 {

    public static void main (String [] args) {
        boolean found_t = true;
        boolean found_f = false;
        boolean found_T = TRUE;
        boolean found_F = FALSE;

        if (found_t) {
            System.out.println(found_t);
        }
        if (!found_f) {
            System.out.println(found_f);
        }
        if (found_T) {
            System.out.println(found_T);
        }
        if (!found_F) {
            System.out.println(found_F);
        }
//        int one = 1;
//        if (one) {
//            System.out.println("1 is true");
//        } else {
//            System.out.println("1 is false");
//        }
    }
}
