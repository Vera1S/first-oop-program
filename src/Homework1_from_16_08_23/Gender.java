package Homework1_from_16_08_23;

public class Gender {
    //Задание № 6 от 05.09.2023г
// 1) в класс Person добавьте "пол" человека. Реализуйте тип данных для пола, как enum (перечисление).
//2) Измените реализацию метода double calculatePension() в классе Worker.
//Теперь расчет пенсии зависит от пола. Для мужчин оставьте старую систему. Для женщин измените формулу на:

//У каждого Worker'а есть две переменных - максимальная и минимальная зарплата. Используйте метод из утилиты
// CalculatorUtils, чтобы найти среднее из минимального значения зарплаты, поделенного на 2 и максимального,
// умноженного на два. После этого возьмите 25% от получившегося значения - это и будет полученная пенсия.

//3) В классе пенсионный фонд реализуйте метод double calculatePensionFor. В него вы будете передавать
// в качестве параметра объект, реализующий интерфейс  AbleToCalculatePension. (подсказка, метод будет
// выглядеть вот так:
//public double calculatePensionFor(AbleToCalculatePension obj)

//4) Реализация метода будет такой: если фонд государственный - просто вызовите метод calculatePension()
// на объекте (на obj), который передаете в параметрах метода и верните его результат.

//Если фонд не государственный, то результат всегда равен 0 (деньги из фонда украли)

    public final static String FEMALE = "FEMALE";     //ctrl+shift+u - чтобы сделать буквы большими

    public final static String MALE = "MALE";
    }

