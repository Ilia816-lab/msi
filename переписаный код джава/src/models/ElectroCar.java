package models;
import interfaces.ElectroCarable;
public class ElectroCar extends Car implements ElectroCarable{

    int batteryCapacity;

    public ElectroCar(int year, int horsePower, String brand, int batteryCapacity, boolean move, int idx) {
        super(year, horsePower, brand, move, idx);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void drive() {
        System.out.println("это слишком сложно для понимания");
    }
    @Override
    public void stop () {
        System.out.println(brand+" остановка");
    }
    @Override
        public void charge(){
        System.out.println(brand+ " заряжен на:"+ batteryCapacity + "% " + "Едет " );
}
public int getBatteryCapacity() {
    return batteryCapacity;
}
}

