package Lesson7_06_09_23;

import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        MessagePrinter messagePrinter = new MessagePrinter();
        Scanner scanner = new Scanner(System.in);
        FieldGenerator fieldGenerator = new FieldGenerator();

        Field field = fieldGenerator.generateField();

        System.out.println(field);

        Game game = new Game(messagePrinter, scanner);
        game.start(field);

    }
}
