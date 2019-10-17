package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    private List<House> houses = new ArrayList<>();

    public void addHouse(House house) {
        houses.add(house);
    }
    public List<House> searchByDistrict(String district) {
        List<House> results = new ArrayList<>();
        for (House house : houses) {
            if (district.toLowerCase().contains(house.getDistrict().toLowerCase())) {
                results.add(house);
            }
        }
        return results;
    }

    public List<House> searchByPrice(int min, int max) {
        List<House> results = new ArrayList<>();
        for (House house : houses) {
            if (house.getPrice() >= min  && house.getPrice() <= max ) {
                results.add(house);
            }
        }
        return results;
    }
}