package rs.in.staleksit.evidencija.geoservice.service;

import org.springframework.stereotype.Service;
import rs.in.staleksit.evidencija.geoservice.model.Country;
import rs.in.staleksit.evidencija.geoservice.repository.CountryRepository;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;

    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findOne(String alpha2) {
        return countryRepository.findOne(alpha2);
    }
}
