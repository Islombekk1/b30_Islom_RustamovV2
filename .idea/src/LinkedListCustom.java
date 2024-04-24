import java.util.Objects;

public class LinkedListCustom<E> {
    private Node head;
    private Node last;
    private int size = 0;

    private class Node {
        private E val;
        private Node next;
        private Node prev;

        public Node(E val) {
            this.val = val;
        }
    }

    public void add(E e){
        if (Objects.isNull(head)){
            head = new Node(e);
            last = head;
        } else {
            last.next = new Node(e);
            last.next.prev = last;
            last = last.next;
        }
        size++;
    }

    public void remove(int ind){
        if (ind == 0){
            head = head.next;
            size--;
            return;
        }

        if (ind == size - 1){
            last.prev.next = null;
            size--;
            return;
        }

        int count = size - 1;
        for (Node x = head; x != null; x = x.next){
            if (count == ind){
                x.prev.next = x.next;
                size--;
                return;
            }
            count--;
        }
    }

    public E get(int ind){
        int count = size - 1;
        for (Node x = head; x != null; x = x.next){
            if (count == ind){
                return x.val;
            }
            count--;
        }

        return null;
    }

    public void contains(E e){
        int count = size - 1;
        for (Node x = head; x != null; x = x.next){
            if (e = count){
                return x.val;
            }
            count--;
        }

        return null;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (Node x = head; x != null; x = x.next){
            sb.append(x.val).append(", ");
        }

        if (sb.length() > 1){
            sb.setLength(sb.length() - 2);
        }

        return sb.append("]").toString();
    }
}
