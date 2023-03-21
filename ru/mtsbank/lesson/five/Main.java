package ru.mtsbank.lesson.five;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Executor executor = new Executor(counter);
        Thread firstThread = new Thread(executor);
        Thread secondThread = new Thread(executor);
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();

        System.out.println("Main: counter value = " + Counter.count);
    }

}
