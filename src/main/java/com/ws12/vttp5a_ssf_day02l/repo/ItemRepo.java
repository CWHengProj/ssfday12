package com.ws12.vttp5a_ssf_day02l.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ws12.vttp5a_ssf_day02l.model.Item;

@Repository
public class ItemRepo {
    private List<Item> itemList = new ArrayList<>();
    public List<Item> getItems(){
        Item itm = new Item("Apple M4 mini", 5);
        itemList.add(itm);
        itm = new Item("Apple M3 mini", 15);
        itemList.add(itm);
        itm = new Item("Apple M1 mini", 25);
        itemList.add(itm);
        itm = new Item("Apple M2 mini", 3);
        itemList.add(itm);
        itm = new Item("Apple macbook", 51);
        itemList.add(itm);
        return itemList;
    }
    
}
