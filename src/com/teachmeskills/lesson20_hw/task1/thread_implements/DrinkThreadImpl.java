package com.teachmeskills.lesson20_hw.task1.thread_implements;

public class DrinkThreadImpl implements Runnable {
    private String name;

    public DrinkThreadImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        doSomething();
    }

    private void doSomething() {
        System.out.println(Thread.currentThread() + " Implements: Read the paper");
    }
}
