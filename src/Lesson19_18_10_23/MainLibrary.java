package Lesson19_18_10_23;

import java.awt.print.Book;
import java.util.*;

import static java.util.List.*;

public class MainLibrary {
    public static void main(String[] args) {
        Books bookFirst = new Books(1, "451 градус по Ф.", BookStatus.RESERVED);
        Books bookSecond = new Books(2, "Библия", BookStatus.RESERVED);
        Books bookThird = new Books(3, "код", BookStatus.OVERDUE);
        Books bookFourth = new Books(4, "Как устроена экономика", BookStatus.RESERVED);
        Books bookFifth = new Books(5, "убить пересмешника", BookStatus.OVERDUE);


//        Student daniil = new Student(null, Set.of(bookThird, bookFourth));
//        Student vera = new Student("Вера", Set.of((bookFifth, bookFirst));
//        Student alex = new Student("Alex", Set.of());
//        Student tatiana = new Student("Tatiana", of());
//
//        List<Student> students = new ArrayList<>();
//        students.add(daniil);
//        students.add(vera);
//        students.add(alex);
//        students.add(tatiana);
//
//        //у нас есть студенты, найти тех, у которых имя длиной больше 5 символов.
//        //Имена студентов, у которых имя больше 5 символов
//
//        List<String> result = students.stream()
//                .map(Student::getName) //сначало надо писать, так: (student -> student.getName()) студент дай/покажи свое имя
//                .filter(Objects::nonNull)   // сначало надо писать, так: (name -> name != null)
//                .filter(name -> name.length() > 5)
//                .toList();
//
//        System.out.println(result);
//
//        //Имена студентов, у которых больше одной книги
//
//        long count = students.stream()
//                .filter(student -> student.getBooks() != null)     //покажи студента у которых есть книги не равно 0
//                .filter(student -> student.getBooks().size() > 1) //если кол-во больше 1, студент отдай книгу
//                .map(Student::getName)                            //студент покажи имя
//                .count();                                         //количество этих людей
//
//        System.out.println(count);
//
//
//        //Имена студентов, у которых больше одной книги и есть просроченные книги
//
////        List<String> names = students.stream()
////                .filter(student -> student.getBooks() != null)
////                .filter(student -> student.getBooks().size() > 1)
////                .filter(Student::checkOverdueBooks) // этот метод подсчитывает просроченные книги
////                .map(Student::getName)
////                .filter(Objects::nonNull)              //покажи студента у которого имя не 0
////                .toList();
////
////        System.out.println(names);
//
//        //найти людей, у кого просрочены книжки (этот метод находится в классе студент)
//        //                .filter(student -> {
//        //                    Set<Book> books = student.getBooks();  //студент покажи книги
//        //                    for (Book book : books) {
//        //                        if (book.getStatus() == BookStatus.OVERDUE) {  //если книги с просроченным сроком покажи мне
//        //                            return true;
//        //                        }
//        //                    }
//        //                    return false;
//        //                })
//
//
//        //найти просроченные книжки
//
//
//        //найти все просроченные книги, длина названия которых больше 8 букв
//
//        List<Book> books = students.stream()
//                .map(Student::getBooks)  //это Set книг коллекция, множество книг
//                .filter(Objects::nonNull)
//                .flatMap(books1 -> books1.stream())  // эта строка берет из коллекции множества книг, в отдельные книги
//                .filter(Objects::nonNull)
//              //  .filter(book -> book.getStatus() == BookStatus.OVERDUE)
//                //.filter(book -> book.getName() != null)
//                //.filter(book -> book.getName().length() > 8)
//                .toList();
//
//        //найти все зарезервированные книги, на людей с именем на букву A
//
//        List<Book> answer = students.stream()
//                .filter(student -> student.getName() != null && student.getName().startsWith("A")) //стартует с буквы А
//                .map(Student::getBooks)
//                .flatMap(Collection::stream) //сначало надо писать, так: (books -> books.stream())
//             //  .filter(book -> book != null && book.getStatus() != null && book.getStatus() == BookStatus.RESERVED)
//                .toList();
//
//        System.out.println(answer);
//
//        //Найти все книги, которые у студентов, у которых id делится на 2
//
//        List<Book> list = students.stream()
//                .filter(student -> student != null && student.getBooks() != null)
//                .map(Student::getBooks)
//                .flatMap(Collection::stream)  //сначало надо писать, так: (books -> books.stream())
//                .filter(book -> book != null && books.getId() > 0 && books.getId() % 2 == 0)
//                .toList();
//
//        System.out.println(list);
//
//        HashMap<String, String> hashMap = new HashMap<>();

        //количество ключей в мапе, которые начинаются на А
//        long count = hashMap.entrySet().stream()
//                .filter(x -> x.getKey().startsWith("A")) //получили ключ, со стартовой буквой "А"
//                .count();
//
//        hashMap.keySet(); //из Мар даст только ключи в виде сета, в виде множества, а потом применить стрим (.stream())
//        hashMap.values();  //отдаст коллекцию из знчений, тоже можно применить стрим (.stream())
//        hashMap.entrySet(); // отдаст специальный объект, который Entry - ячейка, в которой можно получить значение или ключ


        //students.stream
    }

   }

