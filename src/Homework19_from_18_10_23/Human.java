package Homework19_from_18_10_23;
//В отдельном проекте создайте класс Human
//
//У этого класса должны быть поля:
//String name; - имя
//Human mother; - мать
//Human father; - отец
//int age; - возраст
//
//
//Создайте список людей.
//
//
//Теперь создайте два стрима
//1) Находит ВСЕХ родителей ВСЕХ людей в списке
//2) Находит имена матерей тех людей, которые старше, чем 25 лет
//
//
//Напишите ответы на экран
public class Human {
   private String name;
   private int age;

   public Human(String name, int age) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Human{" +
              "name='" + name + '\'' +
              ", age=" + age +
              '}';
   }
}
