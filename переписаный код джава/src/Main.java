
import java.util.Arrays;
import java.util.Optional;

import models.Car;

import models.ElectroCar;
import models.Sedan;
import models.Truck;
import repositories.CarRepositoryy;

public class Main {
    public static void main(String[] args){
        Sedan sedan_0 = new Sedan(2015,1,"Toyota",160, true, 7);
        Sedan sedan_1 = new Sedan(2020,1,"Porsche",255, false, 9);
        Sedan [] sedan = new Sedan[]{sedan_0, sedan_1};
        for (int i=0; i<sedan.length;i++){
            sedan[i].drive();
            sedan[i].stop();
        }
ElectroCar electroCar_0 = new ElectroCar(2020, 100, " Тесла ", 400, true, 7654);
Truck truck_0 = new Truck(2019, 80, " higwey ", 200, false, 87);
truck_0.ultra();
        Car [] cars = new Car[]{ truck_0, electroCar_0};
        for (int i=0; i< cars.length;i++){
            cars[i].drive();
        }
        CarRepositoryy carRepositoryy = new CarRepositoryy();

        Car Sedan = new Sedan(2022, 180, "Porsche", 4, false, 1);
        Car Sedan2 = new Sedan(2011, 14, "qwerty", 3, false, 2);
        Car Sedan3 = new Sedan(20, 10, "bvnc", 4, false, 3);

        carRepositoryy.save(Sedan);
        carRepositoryy.save(Sedan2);
        System.out.println("После save: " + carRepositoryy.count() + " машины");

        carRepositoryy.saveAll(Arrays.asList(Sedan3));
        System.out.println("После saveAll: " + carRepositoryy.count() + " машины");

        Optional<Car> foundCar = carRepositoryy.findById(2);
        System.out.println("Найдена машина с ID 2: " + (foundCar.isPresent() ? foundCar.get().getBrand() : "не найдена"));

        System.out.println("Существует машина с ID 3? " + carRepositoryy.existsById(3)); 

        carRepositoryy.deleteById(1);
        System.out.println("После deleteById(1): " + carRepositoryy.count() + " машины");

        carRepositoryy.deleteAll(Sedan2);
        System.out.println("После deleteAll(car2): " + carRepositoryy.count() + " машины");




        System.out.println("Проверка ElectroCarRepository");
        repositories.ElectroCarRepository electroCarRepo = new repositories.ElectroCarRepository();

        ElectroCar electro1 = new ElectroCar(2021, 150, "Tesla", 500, true, 10);
        ElectroCar electro2 = new ElectroCar(2023, 200, "Lucid", 700, false, 11);

        electroCarRepo.save(electro1);
        electroCarRepo.save(electro2);
        System.out.println("После save: " + electroCarRepo.count() + " электрокаров");

        Optional<ElectroCar> foundElectro = electroCarRepo.findById(11);
        System.out.println("Найден ElectroCar с ID 11: " + (foundElectro.isPresent() ? foundElectro.get().getBrand() : "не найден"));

        System.out.println("Существует электрокар с ID 10? " + electroCarRepo.existsById(10));

        electroCarRepo.deleteById(10);
        System.out.println("После deleteById(10): " + electroCarRepo.count() + " электрокаров");

        electroCarRepo.printAll();
    }
}