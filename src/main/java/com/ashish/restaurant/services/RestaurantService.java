package com.ashish.restaurant.services;

import com.ashish.restaurant.domain.RestaurantCreateUpdateRequest;
import com.ashish.restaurant.domain.entities.Restaurant;

public interface RestaurantService {
    Restaurant createRestaurant(RestaurantCreateUpdateRequest request);
}
