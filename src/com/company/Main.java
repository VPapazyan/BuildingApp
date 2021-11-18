package com.company;

public class Main {

    public static void main(String[] args) {
        Building building = Main.init();

//        System.out.println("The floor with max residents: "+ building.getMaxResidentFloor());
//        System.out.println("The appartement with max residents: "+ building.getMaxResidentAppartement());
        System.out.println("The resident with the given id: " + building.getResidentById(9));
        System.out.println();
    }

    public static Building init() {
        Resident res1 = new Resident(1, "Vahram", "Papazyan");
        Resident res2 = new Resident(2, "Vahan", "Papazyan");
        Resident res3 = new Resident(3, "Varduhi", "Papazyan");
        Resident res4 = new Resident(4, "Vika", "Papazyan");
        Resident res5 = new Resident(5, "Gevorg", "Papazyan");
        Resident res6 = new Resident(6, "Varduhi", "Papazyan");
        Resident res7 = new Resident(7, "Grigor", "Papazyan");
        Resident res8 = new Resident(8, "Ani", "Papazyan");

        Appartement app1 = new Appartement(1);
        app1.add(res1);
        app1.add(res2);
        app1.add(res3);

        Appartement app2 = new Appartement(2);
        app2.add(res4);
        app2.add(res5);

        Appartement app3 = new Appartement(3);
        app3.add(res6);

        Appartement app4 = new Appartement(4);
        app4.add(res7);
        app4.add(res8);

        Floor floor1 = new Floor(1);
        floor1.add(app1);

        Floor floor2 = new Floor(2);
        floor2.add(app2);
        floor2.add(app3);

        Floor floor3 = new Floor(3);
        floor3.add(app4);

        Building building = new Building(1);
        building.add(floor1);
        building.add(floor2);
        building.add(floor3);

        return building;
    }
}
