package Homework17_from_11_10_23;

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

        Function<String, Character> g = (str) -> findCharInString(str);

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

        System.out.println(g.apply(randomStringSupplier.get()));

    }

    public static Character findCharInString(String str1) {
        System.out.println(str1);
        Map<Character, Integer> symbols = new HashMap<>();
        char charPop = 0;
        int maxNumber = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (!symbols.containsKey(str1.charAt(i))) {
                symbols.put(str1.charAt(i), 1);
            }else {
                symbols.put(str1.charAt(i), symbols.get(str1.charAt(i)) + 1);
            }
        }
        System.out.println(symbols);

        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            if (entry.getValue() > maxNumber){
                maxNumber = entry.getValue();
                charPop = entry.getKey();
            }
        }
        return charPop;

    }

}








