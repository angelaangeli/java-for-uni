package Pr23;

public class ArrayQueueModule {
    int size = 5; // Размер круговой очереди
    int front, rear;
    int items[] = new int[size];
    ArrayQueueModule() {
        front = -1;
        rear = -1;
    }
    // Проверяем, не заполнена ли очередь
    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }
    // Проверяем, не пуста ли очередь
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }
    // Добавляем новый элемент
    //Предусловия: значение не должно быть равно null
    //Постусловие: последний элемент очереди равен добавленному элементу и размер очереди увеличился
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Очередь заполнена");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            items[rear] = element;
            System.out.println("Добавлено значение " + element);
        }
    }
    // Удаление элемента
    //Предусловие: размер очереди должен быть больше нуля
    //Постусловия: результатом должен являться первый элемент очереди и указатель начала очереди сдвинется на один
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } //Внутри Q только один элемент, поэтому очередь сбрасывается
           //в начальное состояние после удаления последнего элемента
            else {
                front = (front + 1) % size;
            }
            return (element);
        }
    }
    void clear() {
        size = front = rear = -1;
        System.out.println("Очередь очищена");
    }
    // вывод состояния круговой очереди
    void printsostoyanie() {
        int i;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
        } else {
            System.out.println("Указатель front-> " + front);
            System.out.println("Элементы -> ");
            for (i = front; i != rear; i = (i + 1) % size)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }

    public static void main(String[] args) {

        ArrayQueueModule q = new ArrayQueueModule();
        // Ошибка, потому что FRONT = -1
        q.deQueue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        // Ошибка при добавлении элемента, потому что FRONT == 0 && REAR == SIZE - 1
        q.enQueue(6);
        q.printsostoyanie();
        int elem = q.deQueue();
        if (elem != -1) {
            System.out.println("Удаленный элемент: " + elem);
        }
        q.printsostoyanie();
        q.enQueue(7);
        q.printsostoyanie();
        // Ошибка при добавлении элемента, потому что FRONT == REAR + 1
        q.enQueue(8);
        q.clear();
        q.printsostoyanie();
    }
}
