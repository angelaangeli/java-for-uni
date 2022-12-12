package Spiski_2;
public class Spisok_2<T>{
    private Node<T> head;
    private Node<T> tail;
    public int length;
    public int getLength() {
        return length;
    }
    public Spisok_2(){
        this.head = head;
        this.tail = tail;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public Node<T> getNode(int ind){
        if (ind > length - 1 | ind < 0 ){
            System.out.println("Индекс превышает границы массива");
            return null;
        }
        int count;
        if(length/2 <= ind){
            count = length - 1;
            Node<T> current = tail;
            while (count != ind){
                current = current.prev;
                count--;
            }
            return current;
        }
        Node<T> current = head;
        count = 0;
        while (count != ind){
            current = current.next;
            count++;
        }
        return current;
    }
    public T getByind(int pos){
        return getNode(pos).data;
    }
    public void addFirst(T data){
        Node<T> current = new Node<>(data);
        if (isEmpty()){
            head = tail = current;
            length++;
            return;
        }
        head.prev = current;
        current.next = head;
        head = current;
        tail.next = head;
        head.prev = tail;
        length++;
    }
    public void addLast(T data){
        Node<T> current = new Node<>(data);
        if (isEmpty()){
            head = tail = current;
            length++;
            return;
        }
        tail.next = current;
        current.prev = tail;
        tail = current;
        tail.next = head;
        head.prev = tail;
        length++;
    }
    public void addByIndex(int pos, T data){
        if (pos > length + 1){
            System.out.println("Индекс превышает границы массива");
            return;
        }

        if (pos == 0){
            addFirst(data);
            length++;
            return;
        }
        if (pos == length){
            addLast(data);
            length++;
            return;
        }
        Node<T> current = getNode(pos - 1);
        Node<T> newNode = new Node<>(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        current.next.next.prev = newNode;
        length++;
    }
    public void removeLast(){
        head.prev = tail.prev;
        tail.prev = tail.next;
        length--;
    }
    public void removeFirst(){
        Node<T> current = head.next;
        tail.next = current;
        current.prev = tail;
        head = current;
        length--;
    }
    public void removeAtInd(int index){
        if (index > length - 1 | index < 0 ){
            System.out.println("Индекс превышает границы массива");
            return;
        }
        if (index == length - 1){
            removeLast();
            return;
        }
        if (index == 0){
            removeFirst();
            return;
        }
        Node<T> previous = getNode(index - 1);
        Node<T> next = getNode(index + 1);
        previous.next = next;
        next.prev = previous;
        length--;

    }
    public void print(){
        Node<T> temp = head;
        int count = length;
        while(count > 0){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count--;
        }
    }
}
