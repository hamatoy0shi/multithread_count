package ru.mtsbank.lesson.five;

public class Executor implements Runnable{

    public boolean winner;
    Counter counter;

    public Executor(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (Counter.count < 100) {
            counter.increment();
        }
        if (Counter.winnerName != Thread.currentThread().getName()) {
            System.out.println(Thread.currentThread().getName() + ": I'm late...");
            counter.wake();
        }
    }

}
