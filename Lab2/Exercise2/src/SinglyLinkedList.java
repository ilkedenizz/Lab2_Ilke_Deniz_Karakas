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

    // Delete the middle node
    public void deleteMiddle() {
        if (head == null) {
            return;
        }

        // Count the nodes in the list
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        // If there is only one node, remove it
        if (count == 1) {
            head = null;
            return;
        }

        // Find the node before the middle node
        int middleIndex = count / 2;
        current = head;

        for (int i = 0; i < middleIndex - 1; i++) {
            current = current.next;
        }

        // Remove the middle node
        current.next = current.next.next;
    }

    // Get the head
    public Node getHead() {
        return head;
    }
}