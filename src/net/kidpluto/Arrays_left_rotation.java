package net.kidpluto;

/**
 * Created by Chris on 3/4/2017.
 */
public class Arrays_left_rotation {

    // Move each value in an array one to the left,
    // first value being moved into the last slot
    // Do this multiple times
    //
    public static void main( String [] args) {

        int len = 6;
        int rot = 4;

        int [] arr = new int [] {1,2,3,4,5,6};
        // print array
        for(int i=0;i<len; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // Do the rotation
        for(int j=0; j<rot; j++) {

            int first_value = arr[0];
            for (int i = 1; i < len; i++) {
                arr[i - 1] = arr[i];
            }
            arr[len - 1] = first_value;
        }
        // print array
        for(int i=0;i<len; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
// Code which was submitted
//
//import java.io.*;
//        import java.util.*;
//        import java.text.*;
//        import java.math.*;
//        import java.util.regex.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int len = in.nextInt();
//        int rot = in.nextInt();
//        int arr[] = new int[len];
//        for(int i=0; i < len; i++){
//            arr[i] = in.nextInt();
//        }
//        for(int j=0; j<rot; j++) {
//
//            int first_value = arr[0];
//            for (int i = 1; i < len; i++) {
//                arr[i - 1] = arr[i];
//            }
//            arr[len - 1] = first_value;
//        }
//        // print array
//        for(int i=0;i<len; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//}

