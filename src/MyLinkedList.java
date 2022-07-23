import java.util.Iterator;

public class MyLinkedList<T> implements Iterable {

    private Node<T> head;
    private int size;

    public  void add(T value){
        if(this.head == null){
            this.head = new Node<>(value);
            size++;
            return;
        }
        Node<T> current = head;

        while (current.next != null){
            current = current.next;
        }

        current.next = new Node<>(value);
        size++;

    }

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    public Node<T> getHead(){
        return head;
    }


    public static class Node<T> {

        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
