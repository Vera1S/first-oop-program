package Homework8_from_11_09_23;

import java.util.ArrayList;
import java.util.Random;
//На этом занятии мы только разбирались с теорией коллекций + немного тренировались c arrayList,
// поэтому задание тоже будет чисто на тренировку
//1) Создайте ArrayList, заполните его 100 случайными значениями, используя библиотеку Random
//Решите две задачи и пришлите решение ссылкой на гитхаб

//1) Выведите все элементы списка, которые больше предыдущего элемента этого же списка.
//Пример, если список выглядит так - 1 5 2 4 3
//То мы выведем - 5 4

//2) Выведите значение наименьшего из всех положительных элементов в списке

//Пример, если список выглядит так - 5 -4 3 -2 1
//То мы выведем - 1
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
        ArrayList<Integer> arrayList = new ArrayList<>(size);
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
