package ru.itpark.model;

public class House {
    private int id;
    private String district;
    private TypeOfProperty typeOfProperty;
    private int price;
    private NumberOfRoom numberOfRoom;
    private TypeOfHouse typeOfHouse;

    public House(int id, String district, TypeOfProperty typeOfProperty, int price, NumberOfRoom numberOfRoom, TypeOfHouse typeOfHouse) {
        this.id = id;
        this.district = district;
        this.typeOfProperty = typeOfProperty;
        this.price = price;
        this.numberOfRoom = numberOfRoom;
        this.typeOfHouse = typeOfHouse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public TypeOfProperty getTypeOfProperty() {
        return typeOfProperty;
    }

    public void setTypeOfProperty(TypeOfProperty typeOfProperty) {
        this.typeOfProperty = typeOfProperty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public NumberOfRoom getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(NumberOfRoom numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public TypeOfHouse getTypeOfHouse() {
        return typeOfHouse;
    }

    public void setTypeOfHouse(TypeOfHouse typeOfHouse) {
        this.typeOfHouse = typeOfHouse;
    }

    @Override
    public String toString() {
        String newLine = "\n\r";
        String result;
        result =district + " district" + newLine +
                typeOfProperty + newLine +
                price + " rubles" + newLine +
                numberOfRoom + newLine +
                typeOfHouse + newLine;
        return result;
    }
}
