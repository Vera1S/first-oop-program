package Lesson10_18_09_23;

import java.util.ArrayList;
import java.util.Iterator;

public class MyTestList {
        public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integersSecond = new ArrayList<>();

        MyTestList a = new MyTestList();
        integers.add(2);
        integers.add(5);
        integers.add(22);
        integers.add(32);


        for (int i = 0; i < integers.size(); i++){
            System.out.println(integers.get(i));
        }
        for (int i = 0; i < integers.size(); i++) {
            int integer = integers.get(i);
            System.out.println("Значение " + integer);
            if (integer < 4){
                System.out.println("Да, это число меньше 4");
                int index = integers.indexOf(integer);
                integers.remove(index);
            }

        }
            System.out.println(integers);


        Iterator<Integer> iterator = integers.iterator();

//        System.out.println(iterator.hasNext());
//        System.out.println(iterator);
//            System.out.println(iterator.next());
//            System.out.println(iterator.hasNext());
//            System.out.println(iterator);
//            System.out.println(iterator.next());

            //while (iterator.hasNext()){
            //    System.out.println(integers.get(integers));
            //}
    }
}
