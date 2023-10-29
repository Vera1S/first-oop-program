package Lesson20_23_10_23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class MainReadFile {

        public static void main(String[] args) throws FileNotFoundException {
            File file = new File("daniil/file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            //1 способ
            //String str = null;
            //do {
            //    str = bufferedReader.readLine();
            //    System.out.println(str);
            //} while (str != null);

            //2 способ
            //List<Person> people = new ArrayList<>();
            //
            //while ((str = bufferedReader.readLine()) != null) {
            //    Person person = new Person(str);
            //    people.add(person);
            //}
            //
            //System.out.println(people);

            List<Person> people = bufferedReader.lines()
                    .map(Person::new) //.map(str -> new Person(str))
                    .toList();

            System.out.println(people);




            //String str = bufferedReader.readLine();

            //Person person = new Person(str);

            //System.out.println(person);


        }

    }
