package pl.edu.agh.carbackend.resource;

import org.springframework.web.bind.annotation.*;
import pl.edu.agh.carbackend.model.CarDto;
import pl.edu.agh.carbackend.model.GetCarsResponse;
import pl.edu.agh.carbackend.service.CarService;

@RestController
@RequestMapping(path = "/cars")
public class CarResource {


    private final CarService carService;

    @GetMapping("")
    public GetCarsResponse getCars(
            @RequestParam(required = false, value = "model") String model,
            @RequestParam(required = false, value = ){
        GetCarsResponse response = new GetCarsResponse();
        response.setCars(carService.getCars(model));
        return response;
    }

    @PostMapping("")
    public void addCar(@RequestBody CarDto carDto) {
        carService.addCar(carDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable("id") String regNumber) {
        carService.delete(regNumber);
    }

}
