package Pr27TelBook;
import java.util.Hashtable;
import java.util.Objects;;
public class HashTable<K, V> {
    public void hashTabHash( Telephons t){
        t.hashCode();
    }
    public void hashTabAdd(String key,Telephons tel, Hashtable table){
        table.put(key, tel);
    }
    public void hashTabLookup(Hashtable table){
        table.forEach((k, v) -> System.out.println("Name: " + k + ", " + "Tel: " + v.toString()));
    }
    public void hashTabDelete(Hashtable table, String key){
        table.remove(key);
    }
}
