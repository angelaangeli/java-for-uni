package Spiski_2;

public class Node<T> {

    public Node<T> next;
    public Node<T> prev;
    public T data;
    public Node(T data){
        this.data = data;
    }
}
