package Homework19_from_18_10_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MainHuman {
    public static void main(String[] args) {

        Human grandma = new Human("Бабушка", null, null, 70);
        Human grandpa = new Human("Дедушка", null, null, 75);
        Human mother = new Human("Мать", grandma, grandpa, 45);
        Human father = new Human("Отец", null, null, 50);
        Human child1 = new Human("Ребенок1", mother, father, 30);
        Human child2 = new Human("Ребенок2", mother, father, 20);

        //Создайте список людей.
        List<Human> familyPeople = new ArrayList<>();
        familyPeople.add(grandma);
        familyPeople.add(grandpa);
        familyPeople.add(mother);
        familyPeople.add(father);
        familyPeople.add(child1);
        familyPeople.add(child2);

        //1) Находит ВСЕХ родителей ВСЕХ людей в списке
        List<Human> v = familyPeople.stream()
                .filter(human -> human.getMather() != null)
                .toList();
        System.out.println(v);

        //2) Находит имена матерей тех людей, которые старше, чем 25 лет
        List<String> nameMather = familyPeople.stream()
                .filter(human -> human.getAge() > 25)
                .filter(Objects::nonNull)                         // сначало написала, так: (name -> name != null)
                .filter(human -> mother.getName() != null)
                .map(human -> human.getMather().getName())
                .collect(toList());


    }
}
