package com.ws12.vttp5a_ssf_day02l.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    
    private String code;
    private String name;
    private Integer population;

}