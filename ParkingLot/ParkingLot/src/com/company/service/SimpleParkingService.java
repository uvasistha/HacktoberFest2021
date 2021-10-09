package com.company.service;

import com.company.model.Vehicle;

public class SimpleParkingService extends ParkingService {

    public SimpleParkingService(ParkingStatergy parkingStatergy, PaymentService paymentService, int initialLotSize, int Floor) {
        super(parkingStatergy, paymentService, initialLotSize, Floor);
    }

    public boolean parkVehicle(Vehicle vehicle){
        return parkingStatergy.parkVehicle(parkingSlot,vehicle,paymentService);
    }

    public double exitVehicle(Vehicle vehicle){
        return  parkingStatergy.removeVehicle(parkingSlot,vehicle,paymentService);
    }

}
