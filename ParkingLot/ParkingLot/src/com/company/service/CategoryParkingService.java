package com.company.service;

import com.company.model.Slot;
import com.company.model.Vehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryParkingService extends ParkingService {

    Map<Gate, List<Slot>> gateParkingSlot= new HashMap();

    public CategoryParkingService(ParkingStatergy parkingStatergy, PaymentService paymentService, int initialLotSize, int Floor,int GateNumber) {
        super(parkingStatergy, paymentService, initialLotSize, Floor);
        for(int itr=0;itr<GateNumber;itr++){
            Gate gate = new Gate(itr+1);
            gateParkingSlot.put(gate,parkingSlot);
        }
    }

    @Override
    boolean parkVehicle(Vehicle vehicle) {
        return parkingStatergy.parkVehicle(parkingSlot,vehicle,paymentService);
    }

    @Override
    double exitVehicle(Vehicle vehicle) {
        return parkingStatergy.removeVehicle(parkingSlot,vehicle,paymentService);

    }
}
