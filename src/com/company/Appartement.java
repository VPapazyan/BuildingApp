package com.company;

import java.util.ArrayList;
import java.util.List;

public class Appartement {
    private int number;
    private List<Resident> residents = new ArrayList<>();

    public Appartement() {
    }

    public Appartement(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void add(Resident resident) {
        residents.add(resident);
    }

    public int residentCount() {
        return residents.size();
    }

    public Resident getResidentById(int id) {
        return (Resident) residents.stream().filter(res -> res.getId() == id)
                .findAny()
                .orElse(null);
    }

    @Override
    public String toString() {
        return "Appartement{" +
                "number=" + number +
                ", residents=" + residents +
                '}';
    }
}
