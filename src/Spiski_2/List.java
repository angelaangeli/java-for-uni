package Spiski_2;
import java.util.*;
public class List<E> implements Iterable<E>, Cloneable {
    private Node first;
    private Node last;
    private int size;
    List() {
    }
    List(E... values) {// иницализация элементов
        addAll(values);
    }
    public void clear() { // очистка списка
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    public int size() { // получение размера списка
        return this.size;
    }
    public boolean ifPustoy() {// проверка на пустоту
        return this.size == 0;
    }
    public boolean add(E value) {//проверка на возможность добавлять значения
        addFirst(value);
        return true;
    }
    public void addFirst(E value) {//вставка сохраняя упорядоченность
        if (value != null) {
            if (this.first == null) {
                this.first = new Node(value);
                this.first.prev = this.first.next = this.first;
                this.last = this.first;
            } else {
                Node node = new Node(this.first, this.last, value);
                this.last.next = this.first.prev = node;
                this.first = node;
            }
            this.size++;
        }
    }
    public boolean addAll(E... values) { //добавление значения в начало списка
        boolean result;
        if (result = values != null) {
            for (E value : values) {
                result = result && add(value);
            }
        }
        return result;
    }
    @SafeVarargs
    public static <T> List<T> of(T... values) {//инициализация элементов
        return new List<>(values);
    }
    public E removeFirst() {
        if (ifPustoy()) {
            throw new NoSuchElementException("Список пустой");
        }
        E oldElement;
        if (this.size == 1) {//удаление единственного элемента
            oldElement = this.first.value;
            clear();
        } else {//изменение списка
            oldElement = this.first.value;
            Node newFirst = this.first.next;
            newFirst.prev = this.last;
            this.last.next = newFirst;
            this.first = newFirst;
            this.size--;
        }
        return oldElement;
    }

    public E removeLast() {
        if (ifPustoy()) {
            throw new NoSuchElementException("Список пустой");
        }
        E oldElement;
        if (this.size == 1) {//удаление единственного элемента
            oldElement = this.first.value;
            clear();
        } else {
            oldElement = this.last.value;//изменение списка
            Node newLast = this.last.prev;
            newLast.next = this.first;
            this.first.prev = newLast;
            this.last = newLast;
            this.size--;
        }
        return oldElement;
    }
    public E getFirst() {// gthdsq 'ktvtyn
        if (this.first == null) {
            throw new NoSuchElementException("Список пуст");
        }
        else return this.first.value;
    }
    public E getLast() {// последний элемент
        if (this.last == null) {
            throw new NoSuchElementException("Список пустой");
        }
        else return this.last.value;
    }
    @Override
    public Iterator<E> iterator() {
        return new IteratorLinked();
    }
    private class IteratorLinked implements Iterator<E> {
        private Node cursor = first;
        private int count = 0;

        @Override
        public boolean hasNext() {//проверка на след элемент
            return count < size;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Список пустой");
            }
            E value = cursor.value;
            cursor = cursor.next;
            this.count++;
            return value;
        }
    }
    private class Node {
        private Node next;
        private Node prev;
        private E value;
        Node(Node next, Node prev, E value) {//получение элементов
            this.next = next;
            this.prev = prev;
            this.value = value;
        }
        Node(E value) {//ввод значений
            this(null, null, value);
        }
    }
}