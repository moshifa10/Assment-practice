package org.example;

public class TemperatureConverter {

    static                                double celsiusToFahrenheit(double c){
        return  (c * ((9.0/5.0))) + 32;
    }
    static double fahrenheitToCelsius(double f){
        return (f-32) * 5.0/9;
    }
    static double celsiusToKelvin(double c){
        return c + 273.15;
    }

    public static void main(String[] args){

        double c1 = celsiusToFahrenheit(100.0);
        double f1 = fahrenheitToCelsius(32.0);
        double c2 = celsiusToKelvin(0.0);
        double c3 = celsiusToFahrenheit(37.0);
        double c4 = celsiusToFahrenheit(-40.0);

        System.out.printf("%.2f\n", c1);
        System.out.printf("%.2f\n", f1);
        System.out.printf("%.2f\n", c2);
        System.out.printf("%.2f\n", c3);
        System.out.printf("%.2f\n", c4);
    }
}
