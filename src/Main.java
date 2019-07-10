import linkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = initList();
        System.out.println("=====initList=====");
        SinglyLinkedList.printList(linkedList);

        System.out.println("=====removeTail=====");
        linkedList.removeTail();
        SinglyLinkedList.printList(linkedList);

        System.out.println("=====removeGreaterThanTarget=====");
        linkedList.removeGreaterThanTarget(4);
        SinglyLinkedList.printList(linkedList);
    }


    private static SinglyLinkedList initList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(7);
        list.add(10);
        list.add(8);
        list.add(4);
        list.add(11);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(100);
        return list;
    }

}
