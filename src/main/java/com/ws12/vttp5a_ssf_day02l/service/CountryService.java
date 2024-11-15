package com.ws12.vttp5a_ssf_day02l.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws12.vttp5a_ssf_day02l.model.Country;
import com.ws12.vttp5a_ssf_day02l.repo.CountryRepo;

@Service
public class CountryService {
    
    @Autowired
    CountryRepo countryRepo;

    public List<Country> getCountries() {
        return countryRepo.getCountries();
    }

    public Boolean createCountry(Country c) {
        Boolean result = countryRepo.createCountry(c);

        return result;
    }
}