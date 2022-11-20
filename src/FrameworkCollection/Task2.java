package FrameworkCollection;
import java.util.Iterator;
public class Task2<Type> implements Iterable<Type> {
    private Type[] list;
    private int size;
    public Task2(Type[] newarr) {
        this.list = newarr;
        this.size = newarr.length;
    }
    @Override
    public Iterator<Type> iterator() {
        Iterator<Type> iterator = new Iterator<Type>() {
            private int curindex = 0;
            @Override
            public boolean hasNext() {
                return curindex < size && list[curindex] != null;
            }
            @Override
            public Type next() {
                return list[curindex++];
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return iterator;
    }
}
