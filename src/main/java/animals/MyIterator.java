package animals;

import java.util.*;

public class MyIterator<E> implements Iterator<E> {
private List<E> collection;
private int cursor;
public MyIterator(List<E> collection){
    this.collection = collection;
}
    @Override
    public boolean hasNext() {
    if (collection.isEmpty()) {
        return false;
    } else {
        return true;
    }
    }

    @Override
    public E next() {
    if (collection.isEmpty()){
        throw new RuntimeException("Collection is empty ");
    }
    if (cursor == collection.size()){
        cursor = 0;
    }
        E e = collection.get(cursor);
    cursor++;

        return e;
    }
}
