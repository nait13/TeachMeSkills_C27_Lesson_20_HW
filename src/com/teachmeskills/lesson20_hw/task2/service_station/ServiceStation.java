package com.teachmeskills.lesson20_hw.task2.service_station;

import com.teachmeskills.lesson20_hw.task2.consts.Const;

public class ServiceStation {
    private final int maxCar = Const.MAX_CAR;
    private int carInService = 0;

    public synchronized void putCar() {
        while (carInService >= maxCar) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        carInService++;
        System.out.println("[ADD] -> В сервис");
        System.out.println("Машин на СТО " + carInService);
        notify();
    }

    public synchronized void getCar() {
        while (carInService < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        carInService--;
        System.out.println("[GET] -> Из сервиса!");
        System.out.println("Машин на СТО " + carInService);
        notify();

    }
}
