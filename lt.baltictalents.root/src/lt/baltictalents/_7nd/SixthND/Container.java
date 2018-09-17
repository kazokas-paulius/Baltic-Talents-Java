package lt.baltictalents._7nd.SixthND;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Container<E> implements Iterable<E> {
    private List<E> items = new ArrayList<>();

    void add(E item){
        items.add(item);
    }

    @Override
    public Iterator<E> iterator() {
        return items.iterator();
    }

    public Container<E> order(Comparator<E> comparator){
        items.sort(comparator);
        return this;
    }
}
