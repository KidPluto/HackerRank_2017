package com.kidpluto; /**
 * Created by Chris on 3/4/2017.
 */

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *   https://www.hackerrank.com/challenges/ctci-making-anagrams
 *
 *   Determine the total number of characters, which need to be
 *   deleted, for two strings to have the same characters.
 *
 *   Using linked lists, of Characters, so that I can remove
 *   items easily.
 *
 *   Iterate through word 1, and for each character also found
 *   in word 2, remove that character from both words.
 *   The remaining characters, in both words, are all the
 *   characters which need to be removed for the answer to the
 *   problem.
  */
//
public class Strings_Making_Anagrams {

    public static void main(String args[]) {

        // Define word, and create linked list
        String word_1 = "abwcdef";
        LinkedList<Character> ll_1 = new LinkedList<Character>();
        for (char c : word_1.toCharArray()) {
            ll_1.add(c);
        }
        // Define word, and create linked list
        String word_2 = "efghwwwij";
        LinkedList<Character> ll_2 = new LinkedList<Character>();
        for (char c : word_2.toCharArray()) {
            ll_2.add(c);
        }
        System.out.println("Initial word 1 " + ll_1.toString() + ", word 2 " + ll_2.toString() + " ");

        ListIterator<Character> iter_1 = ll_1.listIterator();
        while (iter_1.hasNext()) {
            if( ll_2.removeFirstOccurrence( iter_1.next())) {
                // if char is found in both words, remove that char in both words
                iter_1.remove();
            }
        }
        System.out.println("Total chars which need to be removed: " + (ll_1.size() + ll_2.size()) + " ");
        System.out.println("Final word 1 " + ll_1.toString() + ", word 2 " + ll_2.toString() + " ");
    }
}
// Code submitted
//import java.io.*;
//        import java.util.*;
//        import java.text.*;
//        import java.math.*;
//        import java.util.regex.*;
//public class Solution {
//    public static int numberNeeded(String first, String second) {
//
//        LinkedList<Character> ll_1 = new LinkedList<Character>();
//        for (char c : first.toCharArray()) {
//            ll_1.add(c);
//        }
//        LinkedList<Character> ll_2 = new LinkedList<Character>();
//        for (char c : second.toCharArray()) {
//            ll_2.add(c);
//        }
//        //System.out.println("Initial word 1 " + ll_1.toString() + ", word 2 " + ll_2.toString() + " ");
//
//        ListIterator<Character> iter_1 = ll_1.listIterator();
//        while (iter_1.hasNext()) {
//            if( ll_2.removeFirstOccurrence( iter_1.next())) {
//                // if char is found in both words, remove that char in both words
//                iter_1.remove();
//            }
//        }
//        //System.out.println("Total chars which need to be removed: " + (ll_1.size() + ll_2.size()) + " ");
//        //System.out.println("Final word 1 " + ll_1.toString() + ", word 2 " + ll_2.toString() + " ");
//        return (ll_1.size() + ll_2.size());
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String a = in.next();
//        String b = in.next();
//        System.out.println(numberNeeded(a, b));
//    }
//}
