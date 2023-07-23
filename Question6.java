import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Question6 {
    public static Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }

        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return head;
    }

    public static void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Enter the elements of the linked list");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            int data = sc.nextInt();
           
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("\nOriginal Linked List:");
        display(head);

        head = removeDuplicates(head);

        System.out.println("\nLinked List after removing duplicates:");
        display(head);

        
    }
}
