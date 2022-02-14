import animals.MyIterator;

import java.util.ArrayList;
import java.util.Iterator;


public class TestIterable<E> implements Iterable<E> {
private ArrayList <E> ar = new ArrayList<E>();
public void add (E add){
    ar.add(add);
}
    @Override
    public Iterator<E> iterator() {
        return new MyIterator<>(ar);
    }

}