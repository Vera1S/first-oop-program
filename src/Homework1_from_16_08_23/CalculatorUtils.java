package Homework1_from_16_08_23;
//    Задача № 5 от 30.08.2023г
//1) Создайте класс-утилиту CalculatorUtils, в котором будет два статических метода с перегрузкой (overloading)
//
//1) calculateAverage(int first, int second)
//2) calculateAverage(int first, int second, int third)

//Эти два метода должны считать среднее значение для двух и для трех введенных чисел соответственно.

//2) Создайте интерфейс AbleToCalculatePension c единственным методом - расчетом пенсии double calculatePension(),
// реализуйте этот интерфейс в классе Worker.

//Реализация в классе Worker:
//У каждого Worker'а есть две переменных - максимальная и минимальная зарплата. Используйте метод из утилиты
// CalculatorUtils, чтобы найти среднее значение этих двух чисел. После этого возьмите 25% от получившегося
// значения - это и будет полученная пенсия.
public class CalculatorUtils {
    public static double calculateAverage(int first, int second) {
        return  (first + second) / 2.0;
    }

    public static double calculateAverage(int first, int second, int third) {

        return (first + second + third) / 3.0;
    }
//У каждого Worker'а есть две переменных - максимальная и минимальная зарплата. Используйте метод из утилиты
// CalculatorUtils, чтобы найти среднее из минимального значения зарплаты, поделенного на 2 и максимального,
// умноженного на два. После этого возьмите 25% от получившегося значения - это и будет полученная пенсия.



//            public static double calculateAvege(int first, double second){
//        return (first + second) * 2;
//            }
}
