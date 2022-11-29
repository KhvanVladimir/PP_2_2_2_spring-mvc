package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getCars(int count) {

        for (int i = 0; i < count; i++) {
            Car testCar = new Car("first" + i, "second" + i, "third" + i);
            cars.add(testCar);
        }
        return cars;
    }
}
