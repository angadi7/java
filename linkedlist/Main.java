package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Adding elements to the linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Display the list
        list.display();

        // Find and print the middle element
        System.out.println("Middle element: " + list.findMiddle());
    }
}

