package Lesson12_25_09_23;

import Lesson6_05_09_23.Cabriolet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        //Map<String, Integer> map = new HashMap<>();
        //map.put("Иванов", 5);
        //map.put("Сидоров", 5);
        //map.put("Петров", 5);
        //map.put("Эльджун", 5);
        //map.put("Иванов", 2);
//
        ////балансировка
//
        //map.remove("Петров");
//
        //System.out.println(map);
//
        //System.out.println(map.get("Петров"));
//
        //System.out.println(map.containsKey("Сидоров"));
        //System.out.println(map.containsKey("Сидор"));
//
        //System.out.println(map.containsValue(5));




        Cabriolet cabriolet = new Cabriolet(4, "byd", "white", 0, false);

        Set<Cabriolet> set = new HashSet<>();

        set.add(cabriolet); //добавилась

        System.out.println(set.contains(cabriolet)); //equals true


        cabriolet.setCurrentSpeed(10);

        set.add(cabriolet);

        cabriolet.setCurrentSpeed(50);

        set.add(cabriolet);

        System.out.println(set);

        String str = "A";


        Set<String> strings = new HashSet<>();

        strings.add(str);

        str.toLowerCase();

        strings.add(str);

        System.out.println(strings);

        Map<Cabriolet, String> cabrioletStringMap = new HashMap<>();

        cabrioletStringMap.put(cabriolet, "300_000");

        cabriolet.setCurrentSpeed(100);

        System.out.println(cabrioletStringMap.get(cabriolet));



        //Краааайне желательно в сетах использовать только иммутабельные классы
        //Еще более крайне желательно в мапе в ключах использовать иммутаблельные классы

    }
}
