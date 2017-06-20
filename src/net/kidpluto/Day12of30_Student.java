package net.kidpluto;

/**
 * Created by Chris on 4/4/2017.
 *
 * Just the bare minimum given as a starting point.
 *
 */
public class Day12of30_Student extends Day12of30_Person {

    private int[] testScores;

    public Day12of30_Student(String firstName, String lastName, int identification) {
        super(firstName, lastName, identification);
    }
    public Day12of30_Student(String firstName, String lastName, int identification, int[] scores)
    {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }
    public Character calculate () {
        return convertToLetterGrade( calculateAverageGrade( ));
    }
    private int calculateAverageGrade( ) {
        int total=0;
        for (int i = 0; i < testScores.length; i++) {
            total += testScores[i];
        }
        return (total/testScores.length);
    }
    @org.jetbrains.annotations.NotNull
    private Character convertToLetterGrade(int grade) {
        if (grade >= 90 && grade <=100) {
            return new Character('O');
        }
        else if (grade >=80 && grade < 90) {
            return new Character('E');
        }
        else if (grade >= 70 && grade < 80) {
            return new Character('A');
        }
        else if (grade >= 55 && grade < 70) {
            return new Character('P');
        }
        else if (grade >= 40 && grade < 55) {
            return new Character('D');
        }
        else return new Character('T');
    }
}
