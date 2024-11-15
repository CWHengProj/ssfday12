package com.ws12.vttp5a_ssf_day02l.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws12.vttp5a_ssf_day02l.model.Item;
import com.ws12.vttp5a_ssf_day02l.repo.ItemRepo;

@Service
public class ItemService {
    @Autowired
    ItemRepo itemRepo;
    
    public List<Item> getItems(){
        return itemRepo.getItems();
    }
}
