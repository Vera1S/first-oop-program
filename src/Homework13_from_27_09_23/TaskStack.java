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
        String encodedMessage = "(Приве)(т, ми)р";



        if (encodedMessage == null) {
            return false;

            boolean isCorrect = true;

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < encodedMessage.length(); i++) {
                char symbol = encodedMessage.charAt(i);
                if (symbol == '(') {
                    stack.push(symbol);
                }
                if (symbol == ')' && (stack.isEmpty() || stack.pop() != (symbol))) {
                    return false;
                }
            }
            return stack.isEmpty();
        }
//            for (char c : encodedMessage.toCharArray()) {
//                if (c == ')') { //убираем скобки
//                    StringBuilder word = new StringBuilder();
//                    // Переворачиваем и выводим буквы слова
//                    System.out.print(word.reverse().toString());
//                } else if (c == '(') {
//
//                } else {
//
//                    stack.push(c);// Добавляем буквы в стек
//                }


// Выводим оставшиеся буквы, если есть

//            while (!stack.isEmpty()) {
//
//                System.out.print(stack.pop());
//            }

        }
    }
}
