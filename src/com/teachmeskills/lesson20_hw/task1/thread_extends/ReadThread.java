package com.teachmeskills.lesson20_hw.task1.thread_extends;

public class ReadThread extends Thread {
    private String nameThread;
    int priorityThread;

    public ReadThread(String name, int num) {
        this.nameThread = name;
        this.priorityThread = num;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(nameThread);
        Thread.currentThread().setPriority(priorityThread);
        doSomething();
    }

    private void doSomething() {
        System.out.println(Thread.currentThread() + " Read the paper");
    }
}
