package com.course.exceptions.domain;

import com.course.exceptions.ex.CalculationException;

public class MToCmConvertor extends DistanceConverter {

    @Override
    public double convert(double distance) throws CalculationException {
        double a=distance*100;
        return a;
    }

    @Override
    public double parse() {
        return 0;
    }
}
