package IbragimovDZ2;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class MyTrichyCollection <T> implements Deque<T> {

    private Object[] data;                                                                //Исходный массив

    private Object[] myTrippletPrev;                                                      //Создание предыдущего массива

    private Object[] myTrippletNext;                                                      //Создание следующего массива
    private int capacity = 5;

    private final int cons = 5;
    private int index = 0;
    private String temp;

    public MyTrichyCollection() {                                              //длина массивов = 5
        this.data = new Object[capacity];

        this.myTrippletPrev = new Object[capacity];

        this.myTrippletNext = new Object[capacity];
        System.out.println("Исходная величина коллекции = " + capacity);
    }


//    public MyTrichyCollection() {
//        this(5);
//    }

    @Override
    public void addFirst(T t) {

        if (index >= data.length) {

            JetFirst();

        }


        data[index] = t;

        System.out.print(data[index] + " ");
        index++;

    }

    private void JetFirst() {

        System.out.println(" ");
        System.out.println("Создание предыдущего триплета");

//        myTrippletPrev[index] = data[index];

            Object [] newData = new Object [data.length+cons];
            for (int i = 0; i < data.length; i++){
                newData[i] = data[i];
            }

            data = newData;
            myTrippletPrev = newData;
            capacity = data.length;

//                System.arraycopy(data, cons, myTrippletPrev, 0, 5);

//            int j = data.length;
//            for (int i = 0; i < data.length; i++) {
//                data[j - 1] = myTrippletPrev[i];
//                j = j - 1;
//            }

        for(int i = 5; i < data.length / 2; i++)
        {
            temp = (String) myTrippletPrev[i];
            myTrippletPrev[i] = myTrippletPrev[myTrippletPrev.length - i - 1];
            myTrippletPrev[myTrippletPrev.length - i - 1] = temp;
        }


        data = myTrippletPrev;




//        System.out.println();
//        System.out.println("Увеличение коллекции на " + cons + " элеметов");
//
//        System.out.println("Величина коллекции = " + data.length);

    }


    @Override
    public void addLast(T t) {

        if (index >= data.length) {

            JetLast();

        }


        data[index] = t;

        System.out.print(data[index] + " ");
        index++;

    }

    private void JetLast() {

        System.out.println(" ");
        System.out.println("Создание следующего триплета");

        Object[] MyTripletNext = new Object[data.length+cons];

        data = MyTripletNext;

//        System.out.println();
//        System.out.println("Увеличение коллекции на " + cons + " элеметов");
//
//        System.out.println("Величина коллекции = " + data.length);

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
        return index;
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
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public Iterator<T> descendingIterator() {
        return null;
    }
}

