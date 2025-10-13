package models;
public class Truck extends Car{
    int loadCapacity;
    int maxCapacity;
    public Truck(int year, int horsePower, String brand, int loadCapacity,boolean move, int idx) {
        super(year, horsePower, brand, move, idx);
            this.loadCapacity = loadCapacity;
    }
    @Override
    public void drive(){
        System.out.println(brand);
}
    @Override
    public void stop() {System.out.println(brand+" остановка");}


    public void ultra(){
        System.out.println("я не знаю что сказать даже ");
    }
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

}


