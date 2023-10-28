package Homework16_09_10_23;

import java.util.Random;
import java.util.Scanner;
import java.util.function.*;

//В отдельном проекте создайте несколько реализаций функциональных интерфейсов с помощью лямбда выражений
//
//1) Functional. Принимает строку, а отдает ее размер
//2) BinaryOperator - принимает две строки, отдает строку - результат сложения двух строк
//3) Supplier. Ничего не принимает, отдает случайно сгенерированное число
//4) Consumer. Принимает число, пишет на экран "привет" количество раз, равное числу
public class TaskLambdaFunction {
    public static void main(String[] args) {

        // Пример 1.1
        Function<String, Integer> str = s -> Integer.valueOf(s);
        String str1 = "12345";
        Integer result = str.apply(str1);
        System.out.println("Число: " + result);

        // Пример 1.2
        Function<String, Integer> strInt = s -> s.length();
        Integer s = strInt.apply(String.valueOf(12));
        System.out.println("Длина строки: " + s);

        // Пример 1.3
        Function<String, Integer> stringLength = (str2) -> str2.length();
        String intString = "Пример строки";
        int length = stringLength.apply(intString);
        System.out.println("Длина строки: " + length);

//       Вариант заполнения сначала

//        BinaryOperator<String> stringBinaryOperator = new BinaryOperator<String>() {
//            @Override
//            public String apply(String s, String s2) {
//                return s + s2;
//            }
//        };
//        String addStr = stringBinaryOperator.apply("Как", "дела?");
//        System.out.println(addStr);

        BinaryOperator<String> stringBinaryOperator = (s1, s2) -> s1 + s2;
        String addStr = stringBinaryOperator.apply("Как ", "дела?");
        System.out.println(addStr);

//              Вариант заполнения сначала
//        Supplier<Integer> integerSupplier1 = new Supplier<Integer>() {
//            @Override
//            public Integer get() {
//                Random random = new Random();
//                return random.nextInt(100) + 1;
//            }
//        };
//        int num1 = integerSupplier1.get();
//        System.out.println("Число: " + num1);

        Random random = new Random();
        Supplier<Integer> integerSupplier = () -> random.nextInt(1, 100);
        int num = integerSupplier.get();
        System.out.println("Число: " + num);

        Consumer<String> inputConsumer = new Consumer<String>() {
            @Override
            public void accept(String d) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число: ");
                int num1 = Integer.valueOf(scanner.next());
                for (int i = 0; i < num1; i++) {
                    String result3 = num1 + d;
                    System.out.println(result3);
                }
            }
        };
            inputConsumer.accept("Hello!");

        Consumer<String> inputConsumer1 = d -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            int num1 = Integer.valueOf(scanner.next());
            for (int i = 0; i < num1; i++) {
                String result3 = num1 + d;
                System.out.println(result3);
            }
        };
        inputConsumer1.accept("Hello!");



//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int num1 = Integer.valueOf(scanner.next());
//        for (int i = 0; i < num1; i++) {
//            System.out.println("Hi" + num1);
//        }
        }

    }

