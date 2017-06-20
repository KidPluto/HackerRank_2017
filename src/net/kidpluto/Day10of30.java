package net.kidpluto;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Chris on 3/22/2017.
 *
 *  Convert int to binary.
 *  Determine largest number of consecutive "1"s
 *
 *  Loop
 *    Get remainder by dividing by 2, which will be 0 or 1
 *    Insert FALSE or TRUE into ArrayList of Booleans
 *    Divide by two, to remove that digit
 *  Pool
 *  Count consecutive TRUEs in the array
 *
 *  5 is 101, consecutive ones is 1
 *  13 is 1101, consecutive ones is 2
 *  439 gave a wrong answer, get 1, correct is 3
 *
 */
public class Day10of30 {

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Integer num = in.nextInt();
        in.close();
        ArrayList<Boolean> booleanArray = new ArrayList<Boolean>();

        while (num>0){
            // System.out.println("Remainder is [" + num%2 + "] ");
            if(num%2 == 1) {
                // System.out.println("True " + num%2);
                booleanArray.add(Boolean.TRUE);
            } else {
                // System.out.println("False " + num%2);
                booleanArray.add(Boolean.FALSE);
            }
            num = num/2;
            // System.out.println("New num is [" + num + "] ");
        }
        System.out.println( booleanArray.toString());

        // Count consecutive ones, or in my case TRUEs
        int count=0;
        int max=0;
        for (Boolean isTrue : booleanArray) {
            if( isTrue) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count=0;
            }
        }
        System.out.println(max);
    }
}
