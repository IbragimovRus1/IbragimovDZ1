package Triplet;

import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> TripletDequeue = new TripletDequeue<>();

        for (int i=0; i<12; i++){
            TripletDequeue.addFirst(i+"");
        }

        for (int i=12; i<30; i++){
            TripletDequeue.addLast(i+"");
//            MyTrichyCollection.offerFirst(i+"Stop");


        }

        System.out.print(TripletDequeue);
    }
}
