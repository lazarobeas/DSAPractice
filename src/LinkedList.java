class Node {
    String data;
    Node next;
    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtHead(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtTail(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // This method will delete the node at the beginning
    public void deleteHeadAtBeginning() {
        if (head == null) {
            return;
        }

        Node temp = head;
        head = head.next;
        temp = null;
    }

    // This method will delete a node at the end
    public void deleteNodeAtEnd() {
        // if list is empty return null
        if (head == null) {
            return;
        }

        // if list only has one element, delete and replace with null
        if (head.next == null) {
            head = null;
            return;
        }

        // find secondtoLast, set the last node equal to second to last inside while loop and remove the last node
        Node secondToLast = head;
        while (secondToLast.next.next != null) {
            secondToLast = secondToLast.next;
        }
        secondToLast.next = null;
    }

    public void traverseLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("End of LL");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtHead("Bill");
        ll.insertAtHead("Billy");
        ll.insertAtTail("Steve");
        ll.insertAtHead("Fk u!");
        ll.insertAtTail("N!gger");
        ll.deleteHeadAtBeginning();
        ll.deleteNodeAtEnd();
        ll.traverseLinkedList();
    }
}
