package com.example.spring.springrest.services;

import java.util.Collection;

import com.example.spring.springrest.models.Goods;

public interface Gooods {
    public abstract void createGoods(Goods gds);
   public abstract void updateGoods(String id, Goods gds);
   public abstract void deleteGoods(String id);
   public abstract Collection<Goods> getGoods();
}
