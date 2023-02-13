package com.example.democratic.lunch.back.domain.service.impl;

import com.example.democratic.lunch.back.domain.model.Restaurant;
import com.example.democratic.lunch.back.domain.repository.RestaurantRepository;
import com.example.democratic.lunch.back.domain.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    RestaurantRepository restaurantRepository;
    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public List<Restaurant> findAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant findById(long id) {
        return restaurantRepository.findById(id);
    }

    @Override
    public Restaurant deleteById(long id) {
        return restaurantRepository.deleteById(id);
    }

    @Override
    public Restaurant findByName(String name) {
        return restaurantRepository.findByName(name);
    }

    @Override
    public Restaurant deleteByName(String name) {
        return restaurantRepository.deleteByName(name);
    }

}
