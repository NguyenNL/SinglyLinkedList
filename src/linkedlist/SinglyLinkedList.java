package linkedlist;

public class SinglyLinkedList {
    private Node head;

    /**
     *
     * @param item
     */
    public void add(int item){
         head = new Node (item, head);
    }

    /**
     *
     */

    public void removeTail() {
        if (head == null)
            return;
        Node temp = head;
        Node previous = null;
        while (temp != null && temp.getNext() != null) {
            previous = temp;
            temp = temp.getNext();
        }
        previous.setNext(null);
    }

    /**
     *
     * @param target
     */
    public void removeGreaterThanTarget(int target) {
        if (head == null)
            return;
        Node cur = head;

        while (cur != null && (cur.getNext() != null)) {
            if (cur.getNext().getValue() > target) {
                cur.setNext(cur.getNext().getNext());
            } else {
                cur = cur.getNext();
            }
        }

        if (head.getValue() > target)
            head = head.getNext();
    }

    public static void printList(SinglyLinkedList list)
    {
        Node currNode = list.head;

        while (currNode != null) {
            System.out.print(currNode.getValue() + " ");
            currNode = currNode.getNext();
        }

        System.out.println(" ");
    }
}
