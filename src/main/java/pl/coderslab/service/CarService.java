package pl.coderslab.service;

import pl.coderslab.domain.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> getCars();

    void add(Car car);

    Optional<Car> get(Long id);
}
