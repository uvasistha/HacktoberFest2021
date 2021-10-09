package com.company.model;

import java.time.LocalDateTime;

public class Slot {

    private boolean occupied;
    private double basicRate;
    private double floorId;
    private Vehicle vehicle;
    private LocalDateTime entry;
    private double rentalFare;

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public double getBasicRate() {
        return basicRate;
    }

    public void setBasicRate(double basicRate) {
        this.basicRate = basicRate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntry() {
        return entry;
    }

    public void setEntry(LocalDateTime entry) {
        this.entry = entry;
    }

    public double getRentalFare() {
        return rentalFare;
    }

    public void setRentalFare(double rentalFare) {
        this.rentalFare = rentalFare;
    }

    public double getFloorId() {
        return floorId;
    }

    public void setFloorId(double floorId) {
        this.floorId = floorId;
    }
}
