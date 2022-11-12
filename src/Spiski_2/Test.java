package Spiski_2;
import java.util.Arrays;
class Test {
    public static void main(String[] args) {
        System.out.println("Вариант 1");
        List<Integer> list = List.of(3, 2, 8, 11, 98, 6, 1, 22,33);
        System.out.println("Двусвязный циклический список " + list);
        System.out.println("Размер: " + list.size());
        for (int index = 0; index < 3; index++) {
            list.addFirst(index );
        }
        System.out.println("Двусвязный циклический список с добавленными элементами "+ list);
        System.out.println("Размер: " + list.size());
        list.clear();
        list = List.of(9, 5, 32, 88, 8, 2, 1, 7, 9);
        System.out.println("Второй список циклический список" + list);
        System.out.println("Размер: " + list.size());
        for (int index = 0; index < 3; index++) {
            list.add(index );
        }
        System.out.println("Второй список циклический список c добавленными элементами" + list);
        System.out.println("Размер: " + list.size());
    }
}