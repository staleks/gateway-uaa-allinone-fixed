package rs.in.staleksit.evidencija.geoservice.repository;

import org.springframework.stereotype.Repository;
import rs.in.staleksit.evidencija.geoservice.model.Country;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryCountryRepository implements CountryRepository {

    private Map<String, Country> countries;

    @Override
    public List<Country> findAll() {
        List<Country> result = new ArrayList<>();
        for (String countryAlpha2Item: countries.keySet()) {
            result.add(countries.get(countryAlpha2Item));
        }
        return result;
    }

    @Override
    public Country findOne(String alpha2) {
        return countries.get(alpha2);
    }

    @PostConstruct
    private void init() {
        countries = new HashMap<>();
        Country country1 = new Country("RS", "SRB", "Serbia");
        countries.put(country1.getAlpha2(), country1);
        Country country2 = new Country("HR", "CRO", "Croatia");
        countries.put(country2.getAlpha2(), country2);
    }

}
