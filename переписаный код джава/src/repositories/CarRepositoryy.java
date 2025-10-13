package repositories;
import interfaces.Repositoryy;
import models.Car;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class CarRepositoryy implements Repositoryy<Car, Integer> {

    private List<Car> cars = new ArrayList<>();

@Override
public Car save(Car endidy) {
    cars.add(endidy);
    return endidy;
}

@Override
    public List<Car> saveAll(Collection<Car> carCollection) {
        List<Car> savedCars = new ArrayList<>();
        for (Car car : carCollection) {
            cars.add(car);
            savedCars.add(car);
        }
        return savedCars;
    }

    @Override
    public Optional<Car> findById(Integer id) {
        for (Car car : cars) {
            if (car.getIdx() == id) {
                return Optional.of(car);
            }
        }
        return Optional.empty();
    }

    @Override
    public void deleteById(Integer id) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getIdx() == id) {
                cars.remove(i);
                break;
            }
        }
    }

    @Override
    public void deleteAll(Car car) {
        List<Car> toRemove = new ArrayList<>();
        for (Car c : cars) {
            if (c.equals(car)) {
                toRemove.add(c);
            }
        }
        cars.removeAll(toRemove);
    }

    @Override
    public long count() {
        return cars.size();
    }

    @Override
    public boolean existsById(Integer id) {
        for (Car car : cars) {
            if (car.getIdx() == id) {
                return true;
            }
        }
        return false;
    }

}