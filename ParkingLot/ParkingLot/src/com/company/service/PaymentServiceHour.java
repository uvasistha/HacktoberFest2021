package com.company.service;

import com.company.model.Slot;

import java.time.LocalDateTime;

public class PaymentServiceHour implements  PaymentService {

    double basicRate;
    double rentalRate;

    public PaymentServiceHour(double basicRate, double rentalRate) {
        this.basicRate = basicRate;
        this.rentalRate = rentalRate;
    }

    @Override
    public double calculatePayment(Slot slot) {
        LocalDateTime currTime = LocalDateTime.now();
        return slot.getBasicRate() + (currTime.getHour() -slot.getEntry().getHour())* slot.getRentalFare();
    }

    @Override
    public void setPrices(Slot slot) {
        slot.setBasicRate(basicRate);
        slot.setRentalFare(rentalRate);
    }
}
