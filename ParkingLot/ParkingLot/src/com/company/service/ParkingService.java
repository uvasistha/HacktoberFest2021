package com.company.service;

import com.company.model.Slot;
import com.company.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingService {
    protected List<Slot> parkingSlot = new ArrayList<>();
    protected int initialLotSize;
    protected int floor;
    protected ParkingStatergy parkingStatergy;
    protected PaymentService paymentService;

    public ParkingService(ParkingStatergy parkingStatergy, PaymentService paymentService, int initialLotSize, int Floor) {
        this.parkingStatergy = parkingStatergy;
        this.paymentService = paymentService;
        this.initialLotSize = initialLotSize;
        this.floor = Floor;

        for(int itr =0; itr<initialLotSize;itr++)
        {
            Slot slot = new Slot();
            slot.setOccupied(false);
            slot.setFloorId((itr+1)%Floor);
            parkingSlot.add(slot);
        }
    }

    abstract boolean parkVehicle(Vehicle vehicle);
    abstract double exitVehicle(Vehicle vehicle);

}
