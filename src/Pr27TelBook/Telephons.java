package Pr27TelBook;
import java.util.Hashtable;
import java.util.Objects;
public class Telephons {
    final String tel;
    Telephons(String tel){
        this.tel = tel;
    }
    public String getTel() {
        return tel;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telephons tel = (Telephons) o;
        return tel.equals(tel.tel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(tel);
    }
    @Override
    public String toString() {
        return " " + tel;
    }
}

