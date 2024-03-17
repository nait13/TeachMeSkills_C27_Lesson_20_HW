package com.teachmeskills.lesson20_hw.task2.runner;

import com.teachmeskills.lesson20_hw.task2.car_arrival.CarArrivalThread;
import com.teachmeskills.lesson20_hw.task2.car_departure.CarDepartureThread;
import com.teachmeskills.lesson20_hw.task2.service_station.ServiceStation;

public class Runner {
    public static void main(String[] args) {
        ServiceStation ss = new ServiceStation();

        Thread carArrival = new CarArrivalThread(ss);
        Thread carDeparture = new CarDepartureThread(ss);

        carArrival.start();
        carDeparture.start();
    }
}
