/*
 * DeleteMiddleDemo.java
 *
 * Tests deleting the middle node of a singly linked list.
 *
 * Name: İlke Deniz Karakaş
 * Student ID: 240444405
 * Date: 13.10.2026
 */

public class DeleteMiddleDemo {
    public static void main(String[] args) {
        System.out.println("=== Delete Middle Node Demo ===");
        System.out.println();

        // Test 1: Odd number of nodes
        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("Original List 1:");
        list1.display();

        list1.deleteMiddle();

        System.out.println("After deleting middle:");
        list1.display();
        System.out.println();

        // Test 2: Even number of nodes
        SinglyLinkedList list2 = new SinglyLinkedList();

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        System.out.println("Original List 2:");
        list2.display();

        list2.deleteMiddle();

        System.out.println("After deleting middle:");
        list2.display();
        System.out.println();

        // Test 3: One node
        SinglyLinkedList list3 = new SinglyLinkedList();

        list3.add(999);

        System.out.println("Original List 3:");
        list3.display();

        list3.deleteMiddle();

        System.out.println("After deleting middle:");
        list3.display();
    }
}