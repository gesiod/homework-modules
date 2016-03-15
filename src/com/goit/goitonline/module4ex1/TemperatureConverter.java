package com.goit.goitonline.module4ex1;

/**
 * Created by Grigoriy on 09.03.2016.
 */
public  class TemperatureConverter {

    public double ConverterCelsiusToFahrenheit (double celsius) {
        return celsius * 1.8 + 32;
    }

    public double ConverterFahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit - 32) /1.8;
    }
}