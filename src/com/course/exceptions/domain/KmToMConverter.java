package com.course.exceptions.domain;

import com.course.exceptions.ex.CalculationException;
import com.course.exceptions.ex.KmToMConvertException;

public class KmToMConverter extends DistanceConverter{
    @Override
    public double convert(double distance) throws KmToMConvertException {
        return distance * 1000;
    }

    @Override
    public double parse() /*throws KmToMConvertException*/ {
        return 0;
    }
}
