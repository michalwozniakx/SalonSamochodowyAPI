package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.coderslab.domain.Car;
import pl.coderslab.repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class JpaCarService implements CarService {

    private final CarRepository carRepository;

    public JpaCarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @Override
    public void add(Car car) {
        carRepository.save(car);

    }

    @Override
    public Optional<Car> get(Long id) {
        return carRepository.findById(id);
    }
}
