package edu.parinya.softarchdesign.structural;

import java.util.ArrayList;
import java.util.List;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private ArrayList<HealthcareServiceable>  team;

    public HealthcareWorkerTeam() {
        this.team = new ArrayList();
    }

    public void addMember(HealthcareServiceable worker) {
        this.team.add(worker);
    }

    public void removeMember(HealthcareWorker worker) {
        this.team.remove(worker);
    }

    public void service() {
        for (HealthcareServiceable i : team){
            i.service();
        }
    }

    public double getPrice() {
        double total = 0;
        for (HealthcareServiceable i : team){
            total += i.getPrice();
        }
        return total;
    }
}