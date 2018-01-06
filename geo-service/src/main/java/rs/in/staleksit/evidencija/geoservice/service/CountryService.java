package rs.in.staleksit.evidencija.geoservice.service;

import rs.in.staleksit.evidencija.geoservice.model.Country;

import java.util.List;

public interface CountryService {

    List<Country> findAll();

    Country findOne(String alpha2);

}
