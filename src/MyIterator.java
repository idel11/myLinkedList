import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

    MyLinkedList.Node<T> current;

    public MyIterator(MyLinkedList<T> current) {
        this.current = current.getHead();
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T value = current.getValue();
        current = current.getNext();
        return value;
    }
}
