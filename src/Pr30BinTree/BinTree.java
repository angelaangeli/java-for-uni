package Pr30BinTree;
import java.util.Stack;

public class BinTree {
    private Node rootNode; // корневой узел
    public BinTree() { // Пустое дерево
        rootNode = null;
    }
    public Node findNodeByValue(int value) { // поиск узла по значению
        Node currentNode = rootNode; // начинаем поиск с корневого узла
        while (currentNode.getValue() != value) { // поиск пока не будет найден элемент или не будут перебраны все
            if (value < currentNode.getValue()) { // движение влево, если значение меньше текущего узла
                currentNode = currentNode.getLeftChild();
            } else { //движение вправо, если значение больше текущего узла
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null) { // если такого потомка нет, то возвращаем null
                return null;
            }
        }
        return currentNode; // возвращаем найденный элемент, если нашли
    }
    public void insertNode(int value) { // метод вставки нового элемента
        Node newNode = new Node(); // создание нового узла
        newNode.setValue(value); // вставка в него данных
        if (rootNode == null) { // если корневой узла нет,
            rootNode = newNode;// то новый элемент делаем корневым
        }
        else { // корневой узел есть
            Node currentNode = rootNode; // начинаем идти с корневого узла
            Node parentNode;
            while (true)
            {
                parentNode = currentNode;//текущий делаем родительским узлом
                if(value == currentNode.getValue()) { // если такой элемент в дереве уже есть, выходим из метода
                    return;
                }
                else  if (value < currentNode.getValue()) {   // движение влево, если вставляемый узел меньше текущего
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null){ // если был достигнут конец,
                        parentNode.setLeftChild(newNode); //  то вставить на место левого потомка и выйти из метода
                        return;
                    }
                }
                else { // движение направо, если вставляемый узел больше текущего
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) { // если был достигнут конец,
                        parentNode.setRightChild(newNode);  //то вставить на место правого потомка и выйти из метода
                        return;
                    }
                }
            }
        }
    }
    public boolean deleteNode(int value) // Удаление узла по заданному значению
    {
        Node currentNode = rootNode;
        Node parentNode = rootNode;
        boolean isLeftChild = true;
        while (currentNode.getValue() != value) { // начинаем поиск узла
            parentNode = currentNode;
            if (value < currentNode.getValue()) { // движение влево, если удаляеемый узел меньше текущего
                isLeftChild = true;
                currentNode = currentNode.getLeftChild();
            }
            else { //движение вправо, если удаляеемый узел больше текущего
                isLeftChild = false;
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null)
                return false; // такого yзела нет, выходим из метода
        }
        if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) { // потомков нет, удаляем узел
            if (currentNode == rootNode) // если узел - корень, то дерево удаляется
                rootNode = null;
            else if (isLeftChild)
                parentNode.setLeftChild(null); // если это левый потомок без потомков, удаляем
            else
                parentNode.setRightChild(null);// если это правый потомок без потомков, удаляем
        }
        else if (currentNode.getRightChild() == null) { // узел заменяется левым поддеревом, если правого потомка нет
            if (currentNode == rootNode)
                rootNode = currentNode.getLeftChild();
            else if (isLeftChild)
                parentNode.setLeftChild(currentNode.getLeftChild());
            else
                parentNode.setRightChild(currentNode.getLeftChild());
        }
        else if (currentNode.getLeftChild() == null) { // узел заменяется правым поддеревом, если левого потомка нет
            if (currentNode == rootNode)
                rootNode = currentNode.getRightChild();
            else if (isLeftChild)
                parentNode.setLeftChild(currentNode.getRightChild());
            else
                parentNode.setRightChild(currentNode.getRightChild());
        }
        else { // если есть два потомка, узел заменяется преемником
            Node heir = receiveHeir(currentNode);// поиск преемника для удаляемого узла
            if (currentNode == rootNode)
                rootNode = heir;
            else if (isLeftChild)
                parentNode.setLeftChild(heir);
            else
                parentNode.setRightChild(heir);
        }
        return true; // элемент удалён
    }

    // метод возвращает узел со следующим значением после передаваемого аргументом.
    // для этого он сначала переходим к правому потомку, а затем
    // отслеживаем цепочку левых потомков этого узла.
    private Node receiveHeir(Node node) {
        Node parentNode = node;
        Node heirNode = node;
        Node currentNode = node.getRightChild(); // Переход к правому потомку
        while (currentNode != null) // Пока остаются левые потомки
        {
            parentNode = heirNode;// потомка задаём как текущий узел
            heirNode = currentNode;
            currentNode = currentNode.getLeftChild(); // переход к левому потомку
        }
        // Если преемник не является правым потомком
        if (heirNode != node.getRightChild())
        { // создать связи между узлами
            parentNode.setLeftChild(heirNode.getRightChild());
            heirNode.setRightChild(node.getRightChild());
        }
        return heirNode;// возвращаем приемника
    }
    //мы вызовем наш метод, используя корень дерева, затем применим его к левому и правому дочерним элементам соответственно ,
    //пока не достигнем листьев дерева:
        public void reverseRecursive (Node treeNode){
            if (treeNode == null) {//пустое дерево
                return;
            }
            Node temp = treeNode.getLeftChild();
            treeNode.setLeftChild(treeNode.getRightChild());
            treeNode.setRightChild(temp);
            reverseRecursive(treeNode.getLeftChild());
            reverseRecursive(treeNode.getRightChild());
        }
        public void printTree() { // вывод дерева в консоль
        Stack globalStack = new Stack(); // общий стек для значений дерева
        globalStack.push(rootNode);//добавим корень дерева в стек
        int gaps = 33; // начальное значение расстояния между элементами
        boolean isRowEmpty = false;//флаг конца строки
        String separator = "------------------------------------------------------------------";
        System.out.println(separator);// черта для указания начала нового дерева
        while (isRowEmpty == false) {
            Stack localStack = new Stack(); // локальный стек для хранения потомков элемента
            isRowEmpty = true;
            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (globalStack.isEmpty() == false) { // пока в общем стеке есть элементы
                Node temp = (Node) globalStack.pop(); // берем следующий, при этом удаляя его из стека
                if (temp != null) {
                    System.out.print(temp.getValue()); // выводим его значение в консоли
                    localStack.push(temp.getLeftChild()); // сохраняем в локальный стек, наследники текущего элемента
                    localStack.push(temp.getRightChild());
                    if (temp.getLeftChild() != null || temp.getRightChild() != null)
                        isRowEmpty = false;
                }
                else {
                    System.out.print("__");// - если элемент пустой
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается в 2 раза
            while (localStack.isEmpty() == false)
                globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
        }
        System.out.println(separator);// подводим черту
    }
}

