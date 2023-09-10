package Lesson6_05_09_23;

    public class Jeep extends Car implements Refuelable{

        public final static int MAX_SPEED = 60;

        @Override
        public void drift() {
            System.out.println("Джип в принципе не умеет дрифтить");
        }

        public void doSomething() {
            System.out.println("Тестовое сообщение");
        }

        @Override
        public void refuel() {
            setFuel(100);
            System.out.println("Джип заправили дизельным топливом");
        }

        public static int getRecomendedSpeed() {
            return MAX_SPEED / 2;
        }
    }

