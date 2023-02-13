package com.example.democratic.lunch.back.domain.service;

import com.example.democratic.lunch.back.domain.model.Restaurant;

import java.util.List;

public interface RestaurantService {
    List<Restaurant> findAll();
    Restaurant save(Restaurant restaurant);

    Restaurant findById(long id);

    Restaurant deleteById(long id);

    Restaurant findByName(String name);

    Restaurant deleteByName(String name);

}
