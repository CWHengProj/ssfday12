package com.ws12.vttp5a_ssf_day02l.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.ws12.vttp5a_ssf_day02l.model.Country;
import com.ws12.vttp5a_ssf_day02l.service.CountryService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    CountryService countryService;
    @GetMapping("")
    public String weather(@RequestParam(required=true, name="country", defaultValue = "Singapore") String city,
    @RequestParam(required=true, name="metrics", defaultValue = "centimeters") String metric, Model model){
        model.addAttribute("city", city);
        model.addAttribute("metrics", metric);
        return "weather";   
    }
    @GetMapping("/city/{country}/metrics/{metrics}")
    public String weather2(@PathVariable(required=true, name="country") String city,
    @PathVariable(required=true, name="metrics") String metric, Model model){
        model.addAttribute("city", city);
        model.addAttribute("metrics", metric);
        return "weather";
    }
    
    @GetMapping("/pagea")
    public String pageA(Model model) {
        String [] units = {"millimeter", "centimeter", "meter"};
        List <Country> countries= countryService.getCountries();
        model.addAttribute("countries", countries);
        model.addAttribute("metrics", units);

        return "pagea";
    }
/*     @GetMapping("/forma")
    public String showForm() {
        return "forma";
    } */
    @GetMapping("/forma")
    public String handlePageA(@RequestBody MultiValueMap<String,String> form) {
        Map<String,String> formData = new HashMap<>();
        for(String str: form.keySet()){
            formData.put(str, form.getFirst(str));
            System.out.println(str + ">>>" + form.getFirst(str));
        }
        return "forma";
    }    
}
