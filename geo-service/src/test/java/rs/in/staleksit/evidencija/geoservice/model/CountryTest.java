package rs.in.staleksit.evidencija.geoservice.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountryTest {

    //~ class under test
    private Country country;

    // verify get method for alpha2
    @Test
    public void getAlpha2() {
        country = new Country("RS", "SRB", "Srbija");
        Assertions.assertNotNull(country);
        Assertions.assertEquals("RS", country.getAlpha2());
    }

    // verify get method for alpha3
    @Test
    public void getAlpha3() {
        country = new Country("RS", "SRB", "Srbija");
        Assertions.assertNotNull(country);
        Assertions.assertEquals("SRB", country.getAlpha3());
    }

    // verify get method for alpha3 not expecting
    @Test
    public void getAlpha3Wrong() {
        country = new Country("RS", "SRB", "Srbija");
        Assertions.assertNotNull(country);
        Assertions.assertNotEquals("CRO", country.getAlpha3());
    }

    @Test
    public void getName() {
        country = new Country("RS", "SRB", "Srbija");
        Assertions.assertNotNull(country);
        Assertions.assertEquals("Srbija", country.getName());
    }

}
