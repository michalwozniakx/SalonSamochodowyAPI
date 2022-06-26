package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
