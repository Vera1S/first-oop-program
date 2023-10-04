package Lesson8_11_09_23;

import java.util.ArrayList;

//Создать ArrayList
//положить в него элементы 97, 65, 43, 102 и 11
//удалить элемент со значение 102
//простой вариант - просто удалить по индексу (потому, что вы визуально его можете посчитать)
//средний вариант - не хардкодить индекс, а найти индекс через метод indexOf, а потом по этому
// методу удалить элемент

//вывести на экран размер листа

//*Найти среднее значение среди всех чисел. сумма всех чисел / кол-во чисел
public class Collection {
    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>();

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

        // как найти среднее значение
        int sum1 = 0;
        for (int i = 0; i < num1.size(); i++){ // это просто цикл для перебора всех элементов в массиве
            System.out.println(num1.get(i));
            // общую сумму поделить на количество, 1 вариант
            sum1 += num1.get(i);
        }
        System.out.println(sum1 / num1.size());

        // общую сумму поделить на количество, 2 вариант для собеседования
        int sum = 0;
        for (Integer integer : num1) {
            sum += integer;
        }
        // общую сумму поделить на количество, 2 вариант (финальная формула вывода)
        System.out.println(sum / num1.size());




    }
}
