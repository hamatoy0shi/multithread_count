package ru.mtsbank.lesson.five;

public class Counter {

    public static Integer count = 0;

    public static String winnerName;

    public synchronized void increment() {
        count++;
        if (Counter.count == 100) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ": I'm winner!");
            winnerName = Thread.currentThread().getName();
            wake();
        }
    }

    public synchronized void wake() {
        notify();
    }

    public synchronized void hybernate() throws InterruptedException {
        wait();
    }

}
