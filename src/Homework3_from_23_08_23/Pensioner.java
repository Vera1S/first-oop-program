package Homework3_from_23_08_23;

import Homework1_from_16_08_23.Person;

public class Pensioner extends Person {
//1 уровень сложности: У вас есть класс Person.
//
//1) Создать классы Pensioner и Worker. Унаследовать их от класса Person.
// В класс Pensioner добавить дробное поле pension (пенсия), в класс Worker
// добавить два поля minSalary и maxSalary (минимальная и максимальная зарплата).

//2) В класс Person добавляем метод die(), который ничего не возвращает, но пишет "Человек погиб".

//3) В классе Worker переопределеяем этот метод (override) таким образом: пишем на экран сообщение
// "Этот человек не дожил до пенсии"

//4) В классе Pensioner переопределяем так: пишем на экран "Этот пенсионер умер, он заработал: x".
// Где вместо x нужно рассчитать значение по формуле "(age-50)*pension"

    private double pension;

    public Pensioner(String name, int age, double height, double weight, int money, double pension){
        super(name, age, height, weight, money);
        this.pension = pension;
    }
    public int getPension(){
        return (int) pension;
    }
    public void setPension(int pension){
        this.pension = pension;
    }

    @Override
    public void die() {
        super.die();
        System.out.println("Этот пенсионер умер, он заработал: " + (getAge() - 50) * pension);

    }
}
