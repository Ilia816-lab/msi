package models;
public class ElectricTruck extends ElectroCar {
    int loadCapacity;
    int maxCapacity;
    int nowater;
    public ElectricTruck(int year, int horsePower, String brand, int batteryCapacity, boolean move, int idx, int nowater) {
        super(year, horsePower, brand,batteryCapacity ,move, idx);
        System.out.println("загрузка на"+loadCapacity);
    }
    }
