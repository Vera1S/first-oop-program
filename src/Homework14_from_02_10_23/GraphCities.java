package Homework14_from_02_10_23;
// Необходимо реализовать на джава такой граф - https://kpolyakov.spb.ru/school/test10bu/4_files/numway2.gif
//
//Задание со звездочкой (не сложное, просто дополнительное) Решите на бумаге задачу:
//http://waksoft.susu.ru/wp-content/uploads/2021/10/graph-schame.jpg
//Найдите самый короткий путь из Рейкявика в Афины

import java.util.ArrayList;
import java.util.List;


public class GraphCities {
    private String name;
    private List<String> city;

    public GraphCities(String name) {
        this.name = name;
        this.city = new ArrayList<>();
    }
    public void add (String cities){
        city.add(cities);
    }
    public String get(String name) {
        for (int i = 0; i < city.size(); i++) {
            if (city.get(i).equals(name)) {
                return city.get(i);
            }
        }
        return null;
    }
    //For-each
    // public String get(String name) {
    //        for (String s : city) {
    //            if (s.equals(name)) {
    //                return s;
    //            }
    //        }
    //        return null;
    //    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GraphCities{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }
}
