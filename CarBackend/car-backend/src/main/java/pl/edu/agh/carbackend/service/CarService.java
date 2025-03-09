package pl.edu.agh.carbackend.service;

import java.util.ArrayList;
import java.util.Li

public class CarService {

    List<CarDto> cars = new ArrayList<>();

    public List<CarDto> getCars(String model) {
        if (model == null || model.isEmpty()) {
            return cars;
        }
        return cars.stream().filter((car) -> car.getModel().equals(model)).collect(Collectors.toList());
    }

    public void addCar(CarDto carDto){
        cars.add(carDto);
    }

    public void delete(String regNumber) {
        cars.removeIf(car -> car.getRegNumber().equals(regNumber));
    }
}
