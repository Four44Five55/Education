package com.gridnine.testing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(FlightBuilder.createFlights());
        String tempSegment;
        for (int i=0;i<FlightBuilder.createFlights().size();i++){
            System.out.println(FlightBuilder.createFlights().get(i));

        }
    }


}
