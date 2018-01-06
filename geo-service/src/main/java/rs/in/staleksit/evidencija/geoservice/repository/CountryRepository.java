package rs.in.staleksit.evidencija.geoservice.repository;

import rs.in.staleksit.evidencija.geoservice.model.Country;

import java.util.List;

public interface CountryRepository {

    List<Country> findAll();

    Country findOne(String alpha2);

}
