import linkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = initList();
        SinglyLinkedList.printList(linkedList);
        linkedList.removeTail();
        SinglyLinkedList.printList(linkedList);
        linkedList.removeGreaterThanTarget(4);
        SinglyLinkedList.printList(linkedList);
    }


    private static SinglyLinkedList initList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        return list;
    }

}
