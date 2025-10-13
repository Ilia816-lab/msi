package models;

public class Sedan extends Car {
    int passCont;
    public Sedan(int year, int horsePower, String brand,int passCont, boolean move, int idx) {
        super(year, horsePower, brand, move, idx);
        this.passCont=passCont;
    }
    @Override
    public void drive() {
        System.out.println(" Porshe едет ");
    }
    @Override
    public void stop() {
        System.out.println("Toyota стоит");
    }
    public void broken(){
        System.out.println("твой седан сгорел(((");
    }


    }
