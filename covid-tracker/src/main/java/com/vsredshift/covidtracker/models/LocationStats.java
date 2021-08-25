package com.vsredshift.covidtracker.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LocationStats {

    private String state;
    private String country;
    private int latestTotalCases;
    private int difference;
}
