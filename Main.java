package IbragimovDZ2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque <String> MyTrichyCollection = new MyTrichyCollection<>();

        for (int i=0; i<12; i++){
            MyTrichyCollection.addFirst(i+"");
        }
        System.out.println(MyTrichyCollection);
    }
}
