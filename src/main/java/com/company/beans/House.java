package com.company.beans;

public class House {
    private int countOfFloors;
    private int countOfFlats;
    private Address address;

    public House() {
    }

    public House(int countOfFloors, int countOfFlats, Address address) {
        this.countOfFloors = countOfFloors;
        this.countOfFlats = countOfFlats;
        this.address = address;
    }

    public int getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(int countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    public int getCountOfFlats() {
        return countOfFlats;
    }

    public void setCountOfFlats(int countOfFlats) {
        this.countOfFlats = countOfFlats;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "House{" +
                "countOfFloors=" + countOfFloors +
                ", countOfFlats=" + countOfFlats +
                ", address=" + address +
                '}';
    }
}
