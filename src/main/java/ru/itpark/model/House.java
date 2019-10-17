package ru.itpark.model;

public class House {
    private String district;
    private TypeOfProperty typeOfProperty;
    private int price;
    private NumberOfRoom numberOfRoom;
    private TypeOfHouse typeOfHouse;

    public House(String district, TypeOfProperty typeOfProperty, int price, NumberOfRoom numberOfRoom, TypeOfHouse typeOfHouse) {
        this.district = district;
        this.typeOfProperty = typeOfProperty;
        this.price = price;
        this.numberOfRoom = numberOfRoom;
        this.typeOfHouse = typeOfHouse;
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

    public void setNumberOfRooms(NumberOfRoom numberOfRooms) {
        this.numberOfRoom = numberOfRooms;
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
        return "House{" + newLine +
                district + " district" + newLine +
                typeOfProperty + newLine +
                price + " rubles" + newLine +
                numberOfRoom + newLine +
                typeOfHouse + newLine +
                '}';
    }
}
