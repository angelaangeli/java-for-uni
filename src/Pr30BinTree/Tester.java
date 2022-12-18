package Pr30BinTree;

public class Tester {
    public static void main(String[] args) {
        BinTree tree = new BinTree();
        // вставляем узлы в дерево:
        tree.insertNode(10);
        tree.insertNode(33);
        tree.insertNode(3);
        tree.insertNode(2);
        tree.insertNode(8);
        tree.insertNode(4);
        tree.insertNode(13);
        tree.insertNode(7);
        tree.insertNode(8);
        tree.insertNode(9);
        tree.insertNode(11);
        // отображение дерева:
        tree.printTree();
        // удаляем один узел и выводим оставшееся дерево в консоли
        tree.deleteNode(3);
        tree.printTree();
        tree.reverseRecursive(tree.findNodeByValue(10));
        tree.printTree();
        // находим узел по значению и выводим его в консоли
        Node foundNode = tree.findNodeByValue(10);
        foundNode.printNode();
    }
}
