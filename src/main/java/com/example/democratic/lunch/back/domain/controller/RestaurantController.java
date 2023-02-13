package com.example.democratic.lunch.back.domain.controller;

import com.example.democratic.lunch.back.domain.model.Restaurant;
import com.example.democratic.lunch.back.domain.service.impl.RestaurantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(exposedHeaders = "erros, content-type") //Resolvendo CrossOrigin definindo que qualquer front end pode fazer a request
@RequestMapping("/restaurant")
public class RestaurantController {
    RestaurantServiceImpl restaurantServiceImpl;
    @Autowired
    public RestaurantController(RestaurantServiceImpl restaurantServiceImpl) {
        this.restaurantServiceImpl = restaurantServiceImpl;
    }

    //Definindo o PostMappgin
    @PostMapping("/post")
    public Restaurant postRestaurant(@RequestBody Restaurant restaurant){
        return restaurantServiceImpl.save(restaurant);
    }

    //Definindo o GetMappgin
    @GetMapping("/list")
    public List<Restaurant> listAllRestaurant(){
        return restaurantServiceImpl.findAll();
    }
}
