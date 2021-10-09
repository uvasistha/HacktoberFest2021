package com.company.service;

import com.company.model.Slot;
import com.company.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public interface ParkingStatergy {

    boolean parkVehicle(List<Slot> parkingSlot , Vehicle vehicle, PaymentService paymentService);

    double removeVehicle(List<Slot> parkingSlot, Vehicle vehicle, PaymentService paymentService);
}
