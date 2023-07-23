import java.util.Scanner;

public class Question5 {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node mergeLinkedLists(Node head1, Node head2) {
        Node mergedHead = new Node(-1); // Dummy node to start the merged list
        Node current = mergedHead;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // Add any remaining nodes from both lists
        if (head1 != null) {
            current.next = head1;
        }
        if (head2 != null) {
            current.next = head2;
        }

        return mergedHead.next;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Split the linked list into two halves
        Node middle = getMiddle(head);
        Node secondHalf = middle.next;
        middle.next = null;

        // Recursively sort both halves
        Node FirstHalf = mergeSort(head);
        Node SecondHalf = mergeSort(secondHalf);

        // Merge the sorted halves
        return mergeLinkedLists(FirstHalf, SecondHalf);
    }

    public static Node getMiddle(Node head) {
        if (head == null) return head;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node createLinkedList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list:");
        int n = scanner.nextInt();
        Node head = null;
        Node current = null;

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        return head;
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        // Input linked lists
        System.out.println("Enter elements for Linked-List-1:");
        Node list1 = createLinkedList();

        System.out.println("Enter elements for Linked-List-2:");
        Node list2 = createLinkedList();

        // Merge and sort the linked lists
        Node mergedList = mergeSort(mergeLinkedLists(list1, list2));

        // Print the sorted linked list
        System.out.print("Output: ");
        printLinkedList(mergedList);
    }
}
