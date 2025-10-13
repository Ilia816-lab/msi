package repositories;
import models.ElectroCar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
public class ElectroCarRepository {

    private List<ElectroCar> cars = new ArrayList<>();

    public ElectroCar save(ElectroCar endidy) {
        cars.add(endidy);
        return endidy;
    }

    public List<ElectroCar> saveAll(Collection<ElectroCar> carCollection) {
        List<ElectroCar> savedCars = new ArrayList<>();
        for (ElectroCar car : carCollection) {
            cars.add(car);
            savedCars.add(car);
        }
        return savedCars;
    }

    public Optional<ElectroCar> findById(int id) {
        for (ElectroCar car : cars) {
            if (car.getIdx() == id) {
                return Optional.of(car);
            }
        }
        return Optional.empty();
    }

    public void deleteById(int id) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getIdx() == id) {
                cars.remove(i);
                break;
            }
        }
    }

    public void deleteAll(ElectroCar endidy) {
        List<ElectroCar> toRemove = new ArrayList<>();
        for (ElectroCar c : cars) {
            if (c.equals(endidy)) {
                toRemove.add(c);
            }
        }
        cars.removeAll(toRemove);
    }

    public long count() {
        return cars.size();
    }

    public boolean existsById(int id) {
        for (ElectroCar car : cars) {
            if (car.getIdx() == id) {
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        for (ElectroCar car : cars) {
            System.out.println(car.getBrand() + car.getYear() + "батарея: " + car.getBatteryCapacity() + "%");
        }
    }
}