package com.ws12.vttp5a_ssf_day02l.repo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ws12.vttp5a_ssf_day02l.model.Country;


@Repository
public class CountryRepo {

    List<Country> countryList;

    public CountryRepo() {
        if (countryList == null)
            countryList = new ArrayList<>();

        Country cty = new Country("SG", "Singapore", 6000000);
        countryList.add(cty);
        cty = new Country("MY", "Malaysia", 8000000);
        countryList.add(cty);
        cty = new Country("IL", "Israel", 10000000);
        countryList.add(cty);
        cty = new Country("CN", "China", 100000000);
        countryList.add(cty);
        cty = new Country("EU", "Europe", 800000000);
        countryList.add(cty);
        cty = new Country("HK", "HOng Kong", 7000000);
        countryList.add(cty);
    }

    public List<Country> getCountries() {

        return countryList;
    }

    public Boolean createCountry(Country cty) {
        if (countryList == null)
            countryList = new ArrayList<>();

        countryList.add(cty);
        return true;
    }

}