package models;

import interfaces.Carable;

public abstract class Car implements Carable{
        public int year;
        int horsePower;
        public String brand;
        boolean move;
        int idx;

        public Car (int year, int horsePower, String brand, boolean move, int idx){
            this.year = year;
            this.horsePower = horsePower;
            this.brand = brand;
            this.move = move;
            this.idx = idx;
        }
    public int getYear() {
        return year;
    }
    public int getHorsePower() {
        return horsePower; 
    }
    public String getBrand() {
        return brand; 
    }
    public boolean isMove() { 
        return move; 
    }
    public int getIdx() { 
        return idx; 
    }

        public abstract void drive();
        public abstract void stop();
}


