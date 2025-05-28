public class singly_linked_list_del {
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static class LinkedList {
        Node head;
        
        // Add a node at the end (for building the list)
        void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        
        // Delete from beginning - O(1) operation
        void deleteFromBeginning() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            head = head.next;
        }
        
        // Delete from end - O(n) operation
        void deleteFromEnd() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            
            // If only one node
            if (head.next == null) {
                head = null;
                return;
            }
            
            // Find the second last node
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            
            // Delete the last node
            temp.next = null;
        }
        
        // Display the list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Adding elements
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        
        System.out.println("Original list:");
        list.display();
        
        // Delete from beginning
        list.deleteFromBeginning();
        System.out.println("After deleting from beginning:");
        list.display();
        
        // Delete from end
        list.deleteFromEnd();
        System.out.println("After deleting from end:");
        list.display();
    }
}
