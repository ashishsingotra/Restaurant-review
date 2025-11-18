package com.ashish.restaurant.services;

import com.ashish.restaurant.domain.GeoLocation;
import com.ashish.restaurant.domain.entities.Address;

public interface GeoLocationService {

    GeoLocation geoLocate(Address address);
}
