package Spiski_2;

public class Test {
    public static void main(String[] args) {
        Spisok_2<Integer> linkedList = new Spisok_2<>();
        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addFirst(1);
        linkedList.print();
        System.out.println();
        System.out.println(linkedList.getByind(4));
        linkedList.addByIndex(1, 5);
        linkedList.print();
        linkedList.removeLast();
        System.out.println();
        linkedList.print();
        System.out.println();
        linkedList.removeFirst();
        linkedList.print();
        System.out.println();
        linkedList.removeAtInd(2);
        linkedList.print();
    }
}
