package net.kidpluto;

import java.util.Scanner;

/**
 * Created by Chris on 6/19/2017.
 */
public class Day15of30_main {

    // My code
    //
    public static Day15of30_node insert(Day15of30_node head, int data) {
        //Complete this method

        // Create new Node
        Day15of30_node NewNode = new Day15of30_node(data);

        // Add it the end of the list
        if (head == null) {
            return NewNode;
        } else {
            Day15of30_node itor = new Day15of30_node(0);
            if (head.next == null) {
                head.next = NewNode;
                return head;
            }
            itor = head.next;
            while (itor.next != null) {
                itor = itor.next;
            }
            itor.next = NewNode;
        }
        return head;
    }

    // Code given with the excercise
    //
    public static void display(Day15of30_node head) {
        Day15of30_node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Day15of30_node head = null;

        // My testing code
        head = insert(head, 5);
        head = insert(head, 4);
        head = insert(head, 3);
        head = insert(head, 2);
        head = insert(head, 1);

//        int N = sc.nextInt();
//
//        while(N-- > 0) {
//            int ele = sc.nextInt();
//            head = insert(head,ele);
//        }
        display(head);
        sc.close();
    }
}

