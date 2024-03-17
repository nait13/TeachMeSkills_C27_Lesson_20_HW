package com.teachmeskills.lesson20_hw.task2.car_departure;

import com.teachmeskills.lesson20_hw.task2.service_station.ServiceStation;

public class CarDepartureThread extends Thread {
    private ServiceStation serviceStation;

    public CarDepartureThread(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        addCarrStation();
    }

    private void addCarrStation() {
        for (int i = 1; i <= 10; i++) {
            serviceStation.getCar();
        }
    }
}
