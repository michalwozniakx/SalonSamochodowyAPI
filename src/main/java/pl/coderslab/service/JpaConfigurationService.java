package pl.coderslab.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.coderslab.domain.Configuration;
import pl.coderslab.repository.ConfigurationRepository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class JpaConfigurationService implements ConfigurationService {

    private final ConfigurationRepository configurationRepository;

    public JpaConfigurationService(ConfigurationRepository configurationRepository){
        this.configurationRepository = configurationRepository;
    }

    @Override
    public List<Configuration> getConfiguration() {
        return configurationRepository.findAll();
    }

    @Override
    public void add(Configuration configuration) {
        configurationRepository.save(configuration);

    }

    @Override
    public Optional<Configuration> get(Long id) {
        return configurationRepository.findById(id);
    }
}
