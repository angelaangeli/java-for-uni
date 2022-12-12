package Spiski_1;

public class Spisok<T> {
    private Node<T> head;
    public int length;
    public int getLength() {
        return length;
    }

    public Spisok(){
        this.head = null;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        length++;
    }
    public void addLast(T data){
        if (isEmpty()){
            head = new Node<>(data);
            return;
        }
        Node<T> current = head;
        Node<T> prev = head;
        while(current != null){
            prev = current;
            current = current.next;
        }
        prev.next = new Node<>(data);
        length++;
    }

    public void remove(){
        head = head.next;
        length--;
    }
    public void removeLast(){
        Node<T> current = head;
        Node<T> prev = head;

        while(current.next != null){
            prev = current;
            current = current.next;
        }

        prev.next = null;
        length--;
    }
    public int get(T data){// Получаем данные для поиска
        if (isEmpty()){
            return -1;
        }

        int position = 0;
        Node<T> current = head;

        while (current.next != null){
            ++position;
            if (current.next.data == data){
                return position;
            }
            current = current.next;
        }
        return -1;
    }
    // Удаление по данным
    public void removeAtdata(T data){

        Node<T> current = head;
        Node<T> prev = head;;

        if (get(data) == -1){
            System.out.println("Такого узла нет в списке!");
            return;
        }
        while(current.data != data){
            prev = current;
            current = current.next;
        }

        prev.next = current.next;
        length--;
    }
    public void removeAtpos(int pos){
        if (pos > length - 1){
            System.out.println("Такого индекса нет в списке(превышает границы списка)");
            return;
        }
        int count = 0;
        Node<T> current = head;
        Node<T> prev = head;
        while (count != pos){
            prev = current;
            current = current.next;
            count++;
        }
        prev.next = current.next;
        length--;
    }
    public void printList(){
        Node<T> temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
