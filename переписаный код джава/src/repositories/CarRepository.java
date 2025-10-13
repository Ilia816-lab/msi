package repositories;
import models.Car;

public class CarRepository {
    private Car[] cars;
    private int count;

    public CarRepository(int capacity) {
        cars = new Car[capacity];
        count = 0;
    }

    public void addCar(Car car) {
        if (count < cars.length) {
            cars[count++] = car;
        } else {
            System.out.println("В репозитории нет места");
        }
    }

    public Car getCar(String brand) {
        for (int i = 0; i < count; i++) {
            if (cars[i].getBrand().equals(brand)) {
                return cars[i];
            }
        }
        return null;
    }

    public void delCar(int idx) {
        if (idx >= 0 && idx < count) {
            for (int i = idx; i < count - 1; i++) {
                cars[i] = cars[i + 1];
            }
            cars[count - 1] = null;
            count--;
        } else {
            System.out.println("Неверный индекс");
        }
    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(cars[i].getBrand() + " " + cars[i].getYear());
        }
    }

    public int size() {
        return count;
    }
}