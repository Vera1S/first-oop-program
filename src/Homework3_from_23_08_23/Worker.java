package Homework3_from_23_08_23;

import Homework1_from_16_08_23.Person;

public class Worker extends Person {

    private int minSalary;
    private int maxSalary;

    public Worker(String name, int age, double height, double weight, int money) {
        super(name, age, height, weight, money);
    }
    public int getMinSalary(){
        return minSalary;
    }
    public int getMaxSalary(){
        return maxSalary;
    }
    public void setMinSalary(){
        this.minSalary = minSalary;
    }
    public void setMaxSalary(){
        this.maxSalary = maxSalary;
    }

    @Override
    public void die() {
        super.die();
        System.out.println("Этот человек не дожил до пенсии");

    }
}
