package com.company.service;

import com.company.model.Vehicle;

public class ParkingLot {

    private ParkingService parkingService;

    public ParkingLot(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    public boolean enterLot(Vehicle vehicle){
        return parkingService.parkVehicle(vehicle);
    }

    public double exitLot(Vehicle vehicle){
        return parkingService.exitVehicle(vehicle);
    }

}
