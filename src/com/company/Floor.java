package com.company;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int number;
    private List<Appartement> appartements = new ArrayList<>();

    public Floor() {
    }

    public Floor(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void add(Appartement appartement) {
        appartements.add(appartement);
    }

    public Resident getResidentById(int id) {
        Resident resident = new Resident();

        for (Appartement appartement : appartements) {
            if (appartement.getResidentById(id) == null) {
                throw new IllegalArgumentException("You don't have such resident in given floor");
            }
            else if (appartement.getResidentById(id).getId() == id) {
                resident = appartement.getResidentById(id);
            }
        }

        return resident;
    }

    public Appartement getMaxResidentAppartement() {
        Appartement appWithMaxResidents = appartements.get(0);

        for (Appartement app: appartements) {
            if (appWithMaxResidents.residentCount() < app.residentCount()) {
                appWithMaxResidents = app;
            }
        }

        return appWithMaxResidents;
    }

    public int getFloorResidentCount() {
        int floorResidents= 0;

        for (Appartement app: appartements) {
            floorResidents += app.residentCount();
        }
        return floorResidents;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "number=" + number +
                ", appartements=" + appartements +
                '}';
    }
}
