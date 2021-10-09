package com.company.service;

import com.company.model.Slot;
import com.company.model.Vehicle;

import java.time.LocalDateTime;
import java.util.List;

public class SimpleParkingMethod implements ParkingStatergy {

    @Override
    public boolean parkVehicle(List<Slot> parkingSlot, Vehicle vehicle, PaymentService paymentService) {
        int itr=0;
        while(itr<parkingSlot.size()) {
            Slot slot = parkingSlot.get(itr);
            if(!slot.isOccupied()) {
                slot.setVehicle(vehicle);
                slot.setOccupied(true);
                slot.setEntry(LocalDateTime.now());
                paymentService.setPrices(slot);
                itr++;
                return true;
            }
            itr++;
        }
        return false;
    }

    @Override
    public double removeVehicle(List<Slot> parkingSlot, Vehicle vehicle, PaymentService paymentService) {
        int itr=0;
        while(itr<parkingSlot.size()) {
            Slot slot = parkingSlot.get(itr);
            if (slot.isOccupied() && slot.getVehicle().equals(vehicle)) {
                slot.setOccupied(false);
                return paymentService.calculatePayment(slot);
            }
            itr++;
        }
        return 0;
    }
}
