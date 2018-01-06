package rs.in.staleksit.evidencija.geoservice.model;

public class Country {

    private final String alpha2;
    private final String alpha3;
    private final String name;

    /**
     * Full constructor.
     *
     * @param alpha2 - ISO-Alpha-2 code for a Country
     * @param alpha3 - ISO-Alpha-3 code for a Country
     * @param name - name for a Country
     */
    public Country(String alpha2, String alpha3, String name) {
        this.alpha2 = alpha2;
        this.alpha3 = alpha3;
        this.name = name;
    }

    public String getAlpha2() {
        return alpha2;
    }

    public String getAlpha3() {
        return alpha3;
    }

    public String getName() {
        return name;
    }

}
