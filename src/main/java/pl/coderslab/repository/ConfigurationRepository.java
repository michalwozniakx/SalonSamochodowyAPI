package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.domain.Configuration;

public interface ConfigurationRepository extends JpaRepository<Configuration, Long> {
}
