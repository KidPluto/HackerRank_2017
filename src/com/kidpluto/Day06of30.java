package com.kidpluto;

/**
 * Created by Chris on 3/18/2017.
 */
public class Day06of30 {

        public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int count = in.nextInt();
//        String a = in.next();
//            int count = 1;
            String str = new String("OneWayOrAnother");

            Character [] charArr = new Character[str.length()];
            int i=0;
            for (char c : str.toCharArray()) {
                charArr[i++] = c;
            }
            // Print even chars
            for(int j=0; j<charArr.length; j+=2) {
                System.out.print(charArr[j]);
            }
            System.out.print(" ");
            //Dam bitch,you smell nice.

            // Print odd chars
            for(int j=1; j<charArr.length; j+=2) {
                System.out.print(charArr[j]);
            }
            System.out.println();

    }
}
