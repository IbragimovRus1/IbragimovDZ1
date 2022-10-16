package Triplet;

import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class TripletDequeue<T> implements Deque<T> {

    private Object[] triplets;
    private int head;
    private int tail;

    private int dec(int i, int modulus) {
        if (--i < 0) {
            i = modulus - 1;
        }
        return i;
    }

    private int inc(int i, int modulus) {
        if (++i >= modulus) {
            i = 0;
        }
        return i;
    }

    private void grow() {
        int oldCapacity = triplets.length;
        int newCapacity = oldCapacity + 1;

        final Object[] es = Arrays.copyOf(triplets, newCapacity);
        if (tail < head || (tail == head && es[head] != null)) {
            int newSpace = newCapacity - oldCapacity;
            System.arraycopy(es, head, es, head + newSpace, oldCapacity - head);
            for (int i = head, to = (head += newSpace); i < to; i++) {
                es[i] = triplets[i];
            }
        }
    }

//    private void copyElements(Collection<? extends T> c) {
//        c.forEach(this::addLast);
//    }

//    public TripletDequeue() {
//        this(c.size());
//        copyElements(c);
//    }

//    public TripletDequeue() {
//        triplets = new TripletDequeue[];
//        triplets[0] = new TripletDequeue<T>();
//    }

    /**
     * Constructs an empty array deque with an initial capacity
     * sufficient to hold the specified number of elements.
     */
//    public TripletDequeue() {
//        triplets = new Object[(numElements < 1) ? 1 : (numElements == Integer.MAX_VALUE) ? Integer.MAX_VALUE : numElements + 1];
//    }

    @Override
    public void addFirst(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        final Object[] es = triplets;
        head = dec(head, es.length);
//        if (triplets.addFirst(t)) {
//            return;
//        }
        if (head == tail) {
            grow();
        }
    }

    @Override
        public void addLast(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        final Object[] es = triplets;
        tail = inc(tail, es.length);
//        if (triplets.addLast(t)) {
//            return;
        if (tail == head) {
            grow();
        }
    }

    @Override
    public boolean offerFirst(T t) {
        return false;
    }

    @Override
    public boolean offerLast(T t) {
        return false;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T pollFirst() {
        return null;
    }

    @Override
    public T pollLast() {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public T peekFirst() {
        return null;
    }

    @Override
    public T peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void push(T t) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return triplets.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public Iterator<T> descendingIterator() {
        throw new RuntimeException("Method not implemented");
    }

}
