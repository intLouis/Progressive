package 多线程;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class blockQ {

    public static void main(String[] args) {
        TreeMap t = new TreeMap();
        t.put(3,"A");
        t.put(4,"B");
        t.put(3,"C");

        System.out.println(t);
    }
}
