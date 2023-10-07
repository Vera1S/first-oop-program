package Lesson10_18_09_23;

import java.util.ArrayList;
import java.util.Iterator;

public class MyTestList {
        public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        MyTestList a = new MyTestList();
        integers.add(2);
        integers.add(5);
        integers.add(22);
        integers.add(32);


        for (int i = 0; i < integers.size(); i++){
            System.out.println(integers.get(i));
        }

        Iterator<Integer> iterator = integers.iterator();

        System.out.println(iterator.hasNext());
        System.out.println(iterator);
    }
}
