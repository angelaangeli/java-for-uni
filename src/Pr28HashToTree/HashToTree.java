package Pr28HashToTree;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class HashToTree {
    public static void main(String[] args)
    {
        // HashSet
        Set<String> setobj = new HashSet<>();
        setobj.add("Cat");
        setobj.add("Wendy");
        setobj.add("Violet");
        setobj.add("Korm");
        setobj.add("Tail");
        //Вывод HashSet
        System.out.println("HashSet: "
                + setobj);
        // HashSet в TreeSet
        Set<String> hashSetToTreeSet
                = new TreeSet<>(setobj);
        // Вывод TreeSet
        System.out.println("TreeSet: "
                + hashSetToTreeSet);
    }
}

