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
   private Human mather;
   private Human father;
   private int age;

   public Human(String name, Human mather, Human father, int age) {
      this.name = name;
      this.mather = mather;
      this.father = father;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Human getMather() {
      return mather;
   }

   public void setMather(Human mather) {
      this.mather = mather;
   }

   public Human getFather() {
      return father;
   }

   public void setFather(Human father) {
      this.father = father;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return "Human{" +
              "name='" + name + '\'' +
              ", mather=" + mather +
              ", father=" + father +
              ", age=" + age +
              '}';
   }
}
