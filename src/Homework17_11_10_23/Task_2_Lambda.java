package Homework17_11_10_23;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

//В отдельном проекте создайте несколько реализаций функциональных интерфейсов
//
//1) Functional. Принимает строку, находит в ней самый часто встречаемый символ и отдает ее
//2) Supplier. Ничего не принимает, отдает случайно сгенерированную строку

//1) Ваша задача создать hashmap, в котором в качестве ключа будет символ, а в качестве значения - сколько
// раз вы его встретили. Если символ новый, запишите его в хешмап со значением 1. Если уже есть, то прибавьте к
// значению +1. Далее найдите символ с наибольшим числом и return его

//2) Сгенерируйте первое число N (пусть от 0 до 100) - это будет длина строки. Далее N раз генерируйте число от
// 0 до 25. Каждое сгенерированное число - это буква алфавита. (от 1 до 26 (от A до Z)). Теперь по каждой цифре
// создавайте букву. Сделать это можно, например, создав HashMap в которой будет связь число-буква. Или любыми другими способами
public class Task_2_Lambda {
    public static void main(String[] args) {
//
        Map<Character, Integer> symbol = new HashMap<>();
        symbol.put('!', 1);
        symbol.put('f', 2);
        symbol.put('@', 1);
        symbol.put('$', 3);
        Function<String, Integer> stringFunction = new Function() {
            @Override
            public Object apply(Object o) {
                String symbolMap = "@zbjkbjdklbjm";
                int key = 0;
                for (int j = 0; j < symbolMap.length()-1; j++);
                char h = symbolMap.charAt(symbol.size());
                System.out.println(h);
                symbol.put(h, 2);
                System.out.println(symbol);
                return o;
            }
        };
        //Integer o = stringFunction.apply(stringFunction.toString());
        System.out.println(stringFunction);

//          Вариант Без Supplier

        Map<Integer, Character> numberToLetterMap = new HashMap<>();
        Random r = new Random();
        // Заполняем отображение чисел и букв
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 26; i++) {
            char letter = alphabet.charAt(i);
            //System.out.println(letter);
            numberToLetterMap.put(i, letter);
           // System.out.println(numberToLetterMap);
        }

        // Пример использования: получение буквы, соответствующей числу
        int number = r.nextInt(26); // Пример числа (0-25)
        char letter = numberToLetterMap.get(number);
        System.out.println("Число " + number + " соответствует букве " + letter);



//          Вариант c Supplier

        Supplier<String> randomStringSupplier = () -> {
            Random random = new Random();
            int ranlength = random.nextInt(101);

            Map<Integer, Character> numberToLetterMap1 = new HashMap<>();
            String alphabet1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int i = 0; i < 26; i++) {
                char letter1 = alphabet1.charAt(i);
                numberToLetterMap1.put(i, letter1);
            }

            StringBuilder randomString = new StringBuilder();
            for (int i = 0; i < ranlength; i++) {
                int randomNumber1 = random.nextInt(26);
                char randomLetter = numberToLetterMap1.get(randomNumber1);
                randomString.append(randomLetter);
            }

            return randomString.toString();
        };

        String randomString = randomStringSupplier.get();
        System.out.println("Сгенерированная строка: " + randomString);

}
        }








