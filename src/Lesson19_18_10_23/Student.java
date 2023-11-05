package Lesson19_18_10_23;


import java.awt.print.Book;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String name;
    private Set<Book> books;
    public Student(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
    }

    public boolean checkOverdueBooks() {
        long count = books.stream()
                .filter(Objects::nonNull)                   //покажи студента у которого имя не 0
                //.filter(book -> book.getStatus() == BookStatus.OVERDUE)
                .count();

        return count > 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

}
