package pl.edu.agh.carbackend.model;

import java.util.List;

public class GetCarsResponse {

    private List<CarDto> cars;

    public List<CarDto> getCars() {
        return cars;
    }

    public void setCars(List<CarDto> cars) {
        this.cars = cars;
    }
}
