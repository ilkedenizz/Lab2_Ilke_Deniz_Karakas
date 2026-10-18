/*
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Name: İlke Deniz Karakaş
 * Student ID: 240444405
 * Date: 13.10.2026
 */

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    // Add a node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    // Display the linked list
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }

        System.out.println("NULL");
    }

    // Find the middle node
    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        // Count the nodes in the list
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        // Find the middle index
        int middleIndex = count / 2;
        current = head;

        // Move to the middle node
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }

        return current;
    }

    // Get the head
    public Node getHead() {
        return head;
    }
}