package net.kidpluto;

/**
 * Created by Chris on 4/4/2017.
 *
 * https://www.hackerrank.com/challenges/30-2d-arrays
 *
 * With a 6x6 array, and the requirements we have, the
 * outer loop will be 0 to 3, and inner loop the same.
 *
 *  Scanner in = new Scanner(System.in);
 *  int arr[][] = new int[6][6];
 *  for(int i=0; i < 6; i++){
 *    for(int j=0; j < 6; j++){
 *    arr[i][j] = in.nextInt();
 *  }
 */
public class Day11of30 {

    // Hardcoded for 6x6 array
    private final static int maxIter = 4;

//    private final static int[][] arr = new int[][]{
//            { 0, 0, 0, 0, 0, 2 },
//            { 0, 0, 2, 0, 0, 1 },
//            { 0, 0, 0, 6, 0, 0 },
//            { 0, 0, 1, 0, 6, 6 },
//            { 0, 1, 2, 0, 0, 5 },
//            { 0, 0, 4, 0, 0, 3 }
//    };

    private final static int[][] arr = new int[][]{
            { 0, -4, -6, 0, -7, -6 },
            { -1, -2, -6, -8, -3, -1 },
            { -8, -4, -2, -8, -8, -6 },
            { -3, -1, -2, -5, -7, -4 },
            { -3, -5, -3, -6, -6, -6 },
            { -3, -6, 0, -8, -6, -7 }
    };

    public static void main(String [] args) {

        int max = -10000; // HACK!

        for (int i = 0; i < maxIter ; i++) {
            for (int j = 0; j < maxIter; j++) {

               // System.out.println("The current value is: " + arr[i][j]);

                // calculate the sum of the "hour glass"
                // 1, 1, 1
                //    2,
                // 3, 3, 3
                //
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] ;
                    if (sum > max) {
                        max = sum;
                    }
            }
        }
        System.out.println(max);
    }
}
