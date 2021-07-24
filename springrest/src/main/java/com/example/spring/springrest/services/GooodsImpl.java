package com.example.spring.springrest.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.example.spring.springrest.models.Goods;

import org.springframework.stereotype.Service;

@Service
public class GooodsImpl implements Gooods {

    private static Map<String, Goods> goodsRepo = new HashMap<>();
   static {
      Goods honey = new Goods();
      honey.setId("1");
      honey.setName("Vegetables");
      goodsRepo.put(honey.getId(), honey);

      Goods almond = new Goods();
      almond.setId("2");
      almond.setName("Fruits");
      goodsRepo.put(almond.getId(), almond);
   }
@Override
public void createGoods(Goods gds) {
    goodsRepo.put(gds.getId(),gds);
    
}
@Override
public void updateGoods(String id, Goods gds) {
    goodsRepo.remove(id);
      gds.setId(id);
      goodsRepo.put(id, gds);
    
}
@Override
public void deleteGoods(String id) {
    goodsRepo.remove(id);
    
}
@Override
public Collection<Goods> getGoods() {
    return goodsRepo.values();
}
    
}
