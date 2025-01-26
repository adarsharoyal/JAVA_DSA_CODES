package DSA;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class ll {
    Node head;

    // Method to insert node at the end of the list
    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    // Helper method to print the list
    public void printreverse(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Reverse nodes in groups of k
    public void showreverse(int k) {
        if (k <= 0) {
            System.out.println("Invalid group size.");
            return;
        }

        Node curr = head;
        Node newHead = null;
        Node prevTail = null;

        while (curr != null) {
            Node prev = null;
            Node groupTail = curr;
            int i = 0;

            // Reverse k nodes in the current group
            while (curr != null && i < k) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                i++;
            }

            // If this is the first group, set the new head
            if (newHead == null) {
                newHead = prev;
            }

            // Link the previous group's tail to the current group's head
            if (prevTail != null) {
                prevTail.next = prev;
            }

            // Update prevTail to the end of the current group (which is groupTail)
            prevTail = groupTail;
        }

        // Print the final reversed list
        printreverse(newHead);
        
    }
}

public class reverse_LinkedListt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ll list = new ll();

        System.out.println("Enter elements of the list, ending with -1:");
        while (true) {
            int data = sc.nextInt();
            if (data == -1) break;
            list.insert(data);
        }

        System.out.println("Enter group size for reversal:");
        int k = sc.nextInt();

        list.showreverse(k);
    }
}
