package com.example.spring.springrest.api;

import java.util.List;

import com.example.spring.springrest.models.Goods;
import com.example.spring.springrest.services.Gooods;
import com.example.spring.springrest.services.PerishableGoods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController implements BaseController {

    @Autowired
    private PerishableGoods pgservice;

    private Gooods gdservice;

    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(gdservice.getGoods(), HttpStatus.OK);
    }

    @PutMapping(value = "/goods/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Goods gds1) {

        gdservice.updateGoods(id, gds1);
        return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
    }

    @DeleteMapping(value = "/goods/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        gdservice.deleteGoods(id);
        return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
    }

    @PostMapping(value = "/goods")
    public ResponseEntity<Object> createProduct(@RequestBody Goods gds2) {
        gdservice.createGoods(gds2);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }




    

    @GetMapping(value = "/names", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getNames() {
        return new ResponseEntity<List<String>>(pgservice.getPGoods(), HttpStatus.OK);
    }

    @GetMapping(value = "/names/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getNamesId(@PathVariable int id) {

        if (id % 2 == 0) {
            System.out.println(id);
            System.out.println(pgservice.getPGoods());
            return new ResponseEntity<List<String>>(pgservice.getPGoods(), HttpStatus.OK);
        } else {
            System.out.println(id);
            return new ResponseEntity<List<String>>(pgservice.getPGoods(), HttpStatus.BAD_REQUEST);
        }
    }
}
