package com.example.democratic.lunch.back.domain.repository;

import com.example.democratic.lunch.back.domain.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Restaurant findById(long id);
    Restaurant deleteById(long id);
    Restaurant findByName(String name);
    Restaurant deleteByName(String name);
}
