package IbragimovDZ2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Deque;

import static org.junit.jupiter.api.Assertions.*;

class MyTrichyCollectionTest {
    private Deque<String> myList = new MyTrichyCollection<>();
    private long ts = System.currentTimeMillis();

    @Test
    void addFirstTest1() {
        Deque<String> MyList = new MyTrichyCollection<>();
        Assertions.assertEquals(0, MyList.size());
        MyList.addFirst("Element1");
        MyList.addFirst("Element2");
        MyList.addFirst("Element3");
        MyList.addFirst("Element4");
        MyList.addFirst("Element5");
        MyList.addFirst("Element6");
        MyList.addFirst("Element7");
        MyList.addFirst("Element8");
        MyList.addFirst("Element9");
        MyList.addFirst("Element10");
//        myList.addFirst("Element11");
//        myList.addFirst("Element12");
//        myList.addFirst("Element13");
//        myList.addFirst("Element14");
//        myList.addFirst("Element15");
//        myList.addFirst("Element16");

        Assertions.assertEquals(13, myList.size());

    }

    @Test
    void addLastTest1(){
        Deque<String> myList = new MyTrichyCollection<>();
        Assertions.assertEquals(0, myList.size());
        myList.addLast("Element1");
        myList.addLast("Element2");
        myList.addLast("Element3");
        myList.addLast("Element4");
        myList.addLast("Element5");
        myList.addLast("Element6");
        myList.addLast("Element7");
        myList.addLast("Element8");
        myList.addLast("Element9");
        myList.addLast("Element10");
        myList.addLast("Element11");
        myList.addLast("Element12");
        myList.addLast("Element13");
        myList.addLast("Element14");
//        myList.addLast("Element15");
//        myList.addLast("Element16");
//        myList.addLast("Element17");
//        myList.addLast("Element18");
//        myList.addLast("Element19");
//        myList.addLast("Element20");
//        myList.addLast("Element21");
//        myList.addLast("Element22");

        Assertions.assertEquals(13, myList.size());
    }

}