package com.course.exceptions.domain;

import com.course.exceptions.ex.CalculationException;

public abstract class DistanceConverter {


    public abstract double convert(double distance) throws CalculationException;

    public abstract double parse();


}
