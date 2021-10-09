package com.company.service;

import com.company.model.Slot;

public interface PaymentService {

    double calculatePayment(Slot slot);

    void setPrices(Slot slot);
}
