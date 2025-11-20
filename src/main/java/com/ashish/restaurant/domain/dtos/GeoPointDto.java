package com.ashish.restaurant.domain.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GeoPointDto {

    private Double latitude;

    private Double Longitude;
}
