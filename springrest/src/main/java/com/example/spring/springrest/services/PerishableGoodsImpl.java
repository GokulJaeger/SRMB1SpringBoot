package com.example.spring.springrest.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PerishableGoodsImpl implements PerishableGoods {

    @Override
    public List<String> getPGoods() {
        return Arrays.asList("Apple","Banana","Grapes","Kiwi", "Lemon","Mango");
    }
    
}
