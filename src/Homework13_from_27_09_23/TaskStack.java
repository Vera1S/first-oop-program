package Homework13_from_27_09_23;

import java.util.Stack;

/*
    Задача от 27.09.2023г
    Задачу решить в отдельном проекте
Школьники Вася и Петя играют в шпионов. Вася передает сообщение Пете. Для этого он разбивает последовательность
букв на пятерки и переворачивает порядок букв в этих пятерках. Например:
"Привет, мир" ->"(Приве)(т, ми)р" ->"евирпим, тр"
Ваша задача, используя Stack восстановить последовательность букв (можно не составлять строку, достаточно
буквы по одной выводить на экран
    */
public class TaskStack {
    public static void main(String[] args) {

        String message = "евирпим, тр";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < message.length(); i++) {
            stack.push(message.charAt(i));

            if (stack.size() == 5) {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
            }
        }
                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
    }
}







