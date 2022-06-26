package pl.coderslab.service;

import pl.coderslab.domain.Configuration;

import java.util.List;
import java.util.Optional;

public interface ConfigurationService {

    List<Configuration> getConfiguration();

    void add(Configuration configuration);

    Optional<Configuration> get(Long id);
}
