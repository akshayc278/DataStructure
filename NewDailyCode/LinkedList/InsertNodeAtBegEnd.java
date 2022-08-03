//insert a node at beginning/end of LL
class SinglyLinkedList {
    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertAtStart(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    void insertAtEnd(int data) {
        if (head == null) {
            head = new ListNode(data);
            return;
        }
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new ListNode(data);
    }

    public static void main(String[] args) {
        SinglyLinkedList sList = new SinglyLinkedList();
        sList.head = new ListNode(5);
        sList.insertAtEnd(12);
        sList.insertAtEnd(13);
        sList.printList();
        sList.insertAtStart(3);
        sList.insertAtStart(1);
        sList.printList();

    }

    void printList() {
        ListNode node = head;
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
        System.out.println();
    }
}
