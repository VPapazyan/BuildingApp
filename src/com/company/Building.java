package com.company;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private int number;
    private List<Floor> floors = new ArrayList<>();

    public Building() {
    }

    public Building(int number) {
        this.number = number;
    }

    public Building(int number, Floor floor) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void add(Floor floor) {
        floors.add(floor);
    }

    public Resident getResidentById(int id) {
        Resident resident = new Resident();

        for (Floor floor : floors) {
            if (floor.getResidentById(id) == null) {
                continue;
            }
            else if (floor.getResidentById(id).getId() == id) {
                resident = floor.getResidentById(id);
                break;
            }
        }

        return resident;
    }

    public Appartement getMaxResidentAppartement() {
        Appartement appartement = floors.get(0).getMaxResidentAppartement();

        for (int i = 0; i < floors.size() - 1; i++) {
            if(appartement.residentCount() < floors.get(i + 1).getMaxResidentAppartement().residentCount()) {
                appartement = floors.get(i + 1).getMaxResidentAppartement();
            }
        }

        return appartement;
    }

    public Floor getMaxResidentFloor() {
        Floor floor = floors.get(0);

        for (int i = 0; i < floors.size() - 1; i++) {
            if (floors.get(i).getFloorResidentCount() < floors.get(i + 1).getFloorResidentCount()) {
                floor = floors.get(i + 1);
            }
        }

        return floor;
    }

    @Override
    public String toString() {
        return "Building{" +
                "number=" + number +
                ", floors=" + floors +
                '}';
    }
}
