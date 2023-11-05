package Lesson18_16_10_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainStream {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        //1) Сначала все числа умножить на 2
        //2) отсортировать те числа, которые меньше 50
        //3) отнять 10 поделить на 4

        System.out.println(list);


        List<Integer> firstStep = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            value *= 2;
            firstStep.add(value);
        }

        System.out.println(firstStep);


        List<Integer> secondStep = new ArrayList<>();

        for (int i = 0; i < firstStep.size(); i++) {
            if (firstStep.get(i) >= 50) {
                secondStep.add(firstStep.get(i));
            }
        }

        System.out.println(secondStep);



        List<Integer> thirdStep = new ArrayList<>();

        for (int i = 0; i < secondStep.size(); i++) {
            int value = secondStep.get(i);
            value -= 10;
            value /= 4;
            thirdStep.add(value);
        }

        System.out.println(thirdStep);


        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("______________________________");

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            value *= 2;
            if (value >= 50) {
                value -= 10;
                value /= 4;
                answer.add(value);
            }
        }

        System.out.println(answer);

        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("______________________________");

        List<Integer> result = list.stream()
                .map((x) -> x * 2)
                .filter((x) -> x >= 50)
                .map((x) -> (x - 10) / 4)
                .toList();

        System.out.println(result);

        //          Вариант Без Supplier

//        Map<Integer, Character> numberToLetterMap = new HashMap<>();
//        Random r = new Random();
//        // Заполняем отображение чисел и букв
//        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        for (int i = 0; i < 26; i++) {
//            char letter = alphabet.charAt(i);
//            //System.out.println(letter);
//            numberToLetterMap.put(i, letter);
//           // System.out.println(numberToLetterMap);
//        }
//
//        // Пример использования: получение буквы, соответствующей числу
//        int number = r.nextInt(26); // Пример числа (0-25)
//        char letter = numberToLetterMap.get(number);
//        System.out.println("Число " + number + " соответствует букве " + letter);

    }

}
