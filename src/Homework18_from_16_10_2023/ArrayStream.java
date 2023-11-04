package Homework18_from_16_10_2023;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// Создать ArrayList. заполните его числами от 0 до 100

//Создайте стрим, который будет делать следующие вещи:
//1) Делит все числа на 2
//2) Оставляет только те, которые больше, чем 25
//3) Вычитает 30 из каждого числа
//4) Сортирует
//5) Выбирает только первых 5 элементов
//6) подсчитывает сумму оставшихся элементов
public class ArrayStream {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        Random random = new Random(1234);

        for (int i = 0; i < 100; i++) {
            number.add(random.nextInt(100));
        }
        System.out.println(number);

        number.stream()
                 .map((x) -> x / 2)
                 .filter((x) -> x > 25)
                 .map((x) -> x - 30)
                 .sorted()
                 .limit(5)
                 .count();

        System.out.println(number);

        // Не понимаю, почему не посчитал сумму?
        // Почему-то я за вами повторяю, а у меня постоянно выходят ошибки,
        // что я не так делаю, можете мне подсказать?
        // Я уже устала от того, что не один код не получается у меня.((



    }
}
