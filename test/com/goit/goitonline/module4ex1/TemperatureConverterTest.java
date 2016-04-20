package com.goit.goitonline.module4ex1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by GRSV on 20.04.2016.
 */
public class TemperatureConverterTest extends TestCase {
    @Test
    public void testConverterCelsiusToFahrenheit() throws Exception {
        TemperatureConverter converter = new TemperatureConverter();
        double celsius = 36.6;
        double result = 97.88000000000001;

        assertEquals(result, converter.ConverterCelsiusToFahrenheit(celsius));

    }

    @Test
    public void testConverterFahrenheitToCelsius() throws Exception {

        TemperatureConverter converter = new TemperatureConverter();
        double fahrenheit = 97.88000000000001;
        double result = 36.6;

        assertEquals(result, converter.ConverterFahrenheitToCelsius(fahrenheit));

    }

}
