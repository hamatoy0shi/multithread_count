package ru.mtsbank.lesson.five;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        for (int i = 1; i < 3;i++) {
            Executor executor = new Executor(counter);
            Thread thread = new Thread(executor);
            thread.start();
        }

        counter.hybernate();
        System.out.println("Main: counter value = " + Counter.count);
    }

}
