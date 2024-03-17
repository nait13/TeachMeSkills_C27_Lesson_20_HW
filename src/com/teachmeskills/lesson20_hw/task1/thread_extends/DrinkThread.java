package com.teachmeskills.lesson20_hw.task1.thread_extends;

public class DrinkThread extends Thread {

    private String nameThread;
    private int priorityThread;

    public DrinkThread(String name, int num) {
        this.nameThread = name;
        this.priorityThread = num;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priorityThread);
        Thread.currentThread().setName(nameThread);
        doSomething();
    }

    private void doSomething() {
        System.out.println(Thread.currentThread() + " Drink coffee");
    }
}
