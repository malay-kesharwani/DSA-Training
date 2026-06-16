class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MergeTwoSortedLists {

    static Node merge(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node current = dummy;

        while (l1 != null && l2 != null) {

            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }

            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        Node result = merge(l1, l2);

        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}
