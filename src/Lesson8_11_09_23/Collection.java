package Lesson8_11_09_23;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();

//Создать ArrayList
        //положить в него элементы 97, 65, 43, 102 и 11
        //удалить элемент со значение 102
        //простой вариант - просто удалить по индексу (потому, что вы визуально его можете посчитать)
        //средний вариант - не хардкодить индекс, а найти индекс через метод indexOf, а потом по этому методу удалить элемент

        //вывести на экран размер листа

        //*Найти среднее значение среди всех чисел. сумма всех чисел / кол-во чисел
        num1.add(97);
        num1.add(65);
        num1.add(43);
        num1.add(102);
        num1.add(11);

        num1.remove(3);

        num1.indexOf(num1.size());
        System.out.println(num1.size());
        System.out.println( num1.isEmpty());
        System.out.println(num1.toString());

        num1.remove(2);
        System.out.println(num1);

        int sum = 0;
        for (Integer integer : num1) {
            sum += integer;
        }
        System.out.println(sum / num1.size());




    }
}
