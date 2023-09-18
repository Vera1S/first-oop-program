package Homework8_from_11_09_23;

import java.util.ArrayList;
import java.util.Random;

public class TaskArrayList {

    public static void main(String[] args) {

        int size = 10;
        int maxValue = 100;
        int minValue = -100;
        ArrayList<Integer> arrayList = createArrayList(size, maxValue, minValue);
        System.out.println(arrayList);
        printMore(arrayList);
        System.out.println(getMinPositiveValue(arrayList));

    }

    public static ArrayList<Integer> createArrayList(int size, int max, int min) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(min, max));

        }
        return arrayList;
    }

    public static void printMore(ArrayList<Integer> arrayList1) {
        for (int i = 1; i < arrayList1.size(); i++) {
            if (arrayList1.get(i - 1) < arrayList1.get(i)) {
                System.out.print(arrayList1.get(i) + " ");
            }
        }
        System.out.println();
    }
    public static int getMinPositiveValue (ArrayList<Integer> arrayList2){
        int min = arrayList2.get(0);
        for (int i = 0; i < arrayList2.size(); i++){
            if (arrayList2.get(i) < min){
                min = arrayList2.get(i);
            }
        }
        return min;
    }
}
