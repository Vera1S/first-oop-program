package Lesson12_25_09_23;

import Lesson1_16_08_23.Car;
import Lesson6_05_09_23.Jeep;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        //ArrayDeque - очередь, в которой элементы находятся в порядке их складывания в очередь
        //PriorityQueue - очередь, которая распологает элементы в порядке их возрастания

        Queue<String> queue = new ArrayDeque<>();
        queue.add("Петров");
        queue.add("Сидоров");
        queue.add("Иванов");

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());


        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        Queue<Integer> queue1 = new ArrayDeque<>();

//        Car car = new Jeep();

        Queue<Integer> integersQueue = new LinkedList<>();
        Deque<Integer> integersDeque = new LinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        integersQueue.add(1);
        integersQueue.add(2);

        integersDeque.add(1);
        integersDeque.add(2);

        linkedList.add(1);
        linkedList.add(2);

        System.out.println(integersQueue.poll());

        System.out.println(integersDeque.poll());
        System.out.println(integersDeque.pollFirst());
        System.out.println(integersDeque.pollLast());

        System.out.println(linkedList.indexOf(1));
        System.out.println(linkedList.poll());
        System.out.println(linkedList.pollFirst());

    }
}
