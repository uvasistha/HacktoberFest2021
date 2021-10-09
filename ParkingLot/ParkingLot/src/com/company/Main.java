package com.company;

import com.company.model.Vehicle;
import com.company.model.VehicleType;
import com.company.service.*;

public class Main {

    public static void main(String[] args) {

        PaymentService  paymentServiceHour = new PaymentServiceHour(10,5);
        ParkingStatergy parkingStatergy = new SimpleParkingMethod();
        ParkingService parkingService = new SimpleParkingService(parkingStatergy,paymentServiceHour,100,4);
        ParkingLot parkingLot = new ParkingLot(parkingService);
        Vehicle swift = new Vehicle(1, VehicleType.LMV);
        Vehicle pulsar = new Vehicle(1, VehicleType.LMV);

        System.out.println(parkingLot.enterLot(swift));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(parkingLot.enterLot(pulsar));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(parkingLot.exitLot(swift));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(parkingLot.exitLot(pulsar));


    }
}
