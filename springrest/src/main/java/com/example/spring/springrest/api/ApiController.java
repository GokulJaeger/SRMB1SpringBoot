package com.example.spring.springrest.api;
import java.util.List;

import com.example.spring.springrest.services.PerishableGoods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController extends BaseController {

    @Autowired
    private PerishableGoods pgservice;

    @GetMapping(value = "/names", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getNames() {
        return new ResponseEntity<List<String>>(pgservice.getPGoods(), HttpStatus.OK);
    }

    @GetMapping(value = "/names/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getNamesId(@PathVariable int id) {
        System.out.println(id);
        if (id /0 == 0) {
            return new ResponseEntity<List<String>>(pgservice.getPGoods(), HttpStatus.OK);
        } else {
            return new ResponseEntity<List<String>>(pgservice.getPGoods(), HttpStatus.BAD_REQUEST);
        }
    }
}
