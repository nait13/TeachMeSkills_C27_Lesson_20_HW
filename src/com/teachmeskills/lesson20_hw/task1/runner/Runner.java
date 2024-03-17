package com.teachmeskills.lesson20_hw.task1.runner;

import com.teachmeskills.lesson20_hw.task1.thread_extends.BreakfastThread;
import com.teachmeskills.lesson20_hw.task1.thread_extends.ReadThread;
import com.teachmeskills.lesson20_hw.task1.thread_extends.DrinkThread;

import com.teachmeskills.lesson20_hw.task1.thread_implements.BreakfastThreadImpl;
import com.teachmeskills.lesson20_hw.task1.thread_implements.DrinkThreadImpl;
import com.teachmeskills.lesson20_hw.task1.thread_implements.ReadThreadImpl;

public class Runner {
    public static void main(String[] args) {
        Thread myT1 = new BreakfastThread("eat",3);
        Thread myT2 = new ReadThread("read",2);
        Thread myT3 = new DrinkThread("drink",1);

        myT1.start();
        myT2.start();
        myT3.start();

        Thread myt4 = new Thread(new BreakfastThreadImpl("eat"));
        Thread myt5 = new Thread(new DrinkThreadImpl("read"));
        Thread myt6 = new Thread(new ReadThreadImpl("drink "));

        myt4.setPriority(3);
        myt5.setPriority(2);
        myt6.setPriority(1);

        myt4.start();
        myt5.start();
        myt6.start();

    }
}
