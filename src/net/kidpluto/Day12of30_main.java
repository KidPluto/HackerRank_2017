package net.kidpluto;

/**
 * Created by Chris on 4/4/2017.
 *
 * https://www.hackerrank.com/challenges/30-inheritance
 */
public class Day12of30_main {

    public static void main (String[] args) {
        String firstName = new String("Stuward");
        String lastName  = new String("Jolly");
        int    id        = 33;
//        int[]  arr       = new int[]{70, 80, 99};
        int[]  arr       = new int[]{100, 80};

        Day12of30_Student stu = new Day12of30_Student(firstName, lastName, id, arr);
        Character grade = stu.calculate();
        System.out.println("Letter grade: " + grade);
    }
}
