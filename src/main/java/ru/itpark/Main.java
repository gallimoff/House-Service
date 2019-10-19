package ru.itpark;

import ru.itpark.model.House;
import ru.itpark.model.NumberOfRoom;
import ru.itpark.model.TypeOfHouse;
import ru.itpark.model.TypeOfProperty;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService house = new HouseService();
        house.addHouse(new House(1,"Brent", TypeOfProperty.APARTMENT, 2_500_000, NumberOfRoom.ONE_ROOM, TypeOfHouse.SECONDARY_HOUSING));
        house.addHouse(new House(2,"Merton", TypeOfProperty.APARTMENT, 4_000_000, NumberOfRoom.ONE_ROOM, TypeOfHouse.NEW_HOUSE));

        System.out.println(house.searchByDistrict("Merton"));
        System.out.println(house.searchByPrice(1_000_000, 5_000_000));

    }
}

