package com.ashish.restaurant.repositories;

import com.ashish.restaurant.domain.entities.Restaurant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RestaurantRepository extends ElasticsearchRepository<Restaurant,String> {

    //TODO: Custom Method
}
