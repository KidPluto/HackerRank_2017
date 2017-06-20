package net.kidpluto;

/**
 * Created by Chris on 3/21/2017.
 *
 * https://www.hackerrank.com/challenges/30-recursion
 */
public class Day09of30 {

    public static void main (String [] args) {
//        Day09of30 obj = new Day09of30();
//        obj.dec(10);

        Day09of30 obj = new Day09of30();
        System.out.println("Result is:" + obj.factorial(4));
    }
    public void dec(int num) {
        if(num>0) {
            System.out.println("num is [" + num + "] ");
            dec(--num);
        }
        else {
            System.out.println("num too small");
        }
    }
    public int factorial (int num){
        if(num <= 2 || num >= 12){
            return num;
        }
        return num * factorial(num-1);
    }
}
