package edu.parinya.softarchdesign.structural;

import java.util.Date;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator {
    public TaxPayingHealthcareWorker(HealthcareWorkerDecorator worker) {
        super(worker);
        System.out.println("Decorate "+ worker.getName() +" with TaxPaying");
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.1;
    }
}