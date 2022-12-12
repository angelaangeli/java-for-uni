package Spiski_1;
public class Test {
    public static void main(String[] args) {
        Spisok<Integer> linkedList = new Spisok<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.printList();
        System.out.println();
        linkedList.addLast(6);
        linkedList.addLast(7);
        linkedList.printList();
        System.out.println();
        linkedList.removeLast();
        linkedList.printList();
        System.out.println();
        linkedList.remove();
        linkedList.printList();
        System.out.println();
        System.out.println(linkedList.get(1));
        linkedList.removeAtdata(5);
        linkedList.printList();
        System.out.println();
        linkedList.removeAtdata(1);
        linkedList.printList();
        System.out.println();
        linkedList.removeAtpos(2);
        linkedList.printList();
        System.out.println();
        linkedList.removeAtpos(3);
        linkedList.printList();
        System.out.println();
        linkedList.removeAtpos(1);
        linkedList.printList();
        System.out.println();
    }
}
