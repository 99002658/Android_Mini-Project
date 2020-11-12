package com.lnt.mycalculator;

public class Tconverter {
    public enum Unit {
        CELSIUS,
        FAHRENHEIT,
        KELVIN;


        // Helper method to convert text to one of the above constants
        public static Tconverter.Unit fromString(String text) {
            if (text != null) {
                for (Tconverter.Unit unit : Tconverter.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;

    public Tconverter(Tconverter.Unit from, Tconverter.Unit to, double input) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case CELSIUS:
                if (to == Tconverter.Unit.FAHRENHEIT) {
                    constant = (input*1.8) + 32;
                } else if (to == Tconverter.Unit.KELVIN) {
                    constant = input + 273.15;
                }
                break;
            case FAHRENHEIT:
                if (to == Tconverter.Unit.CELSIUS) {
                    constant = (input-32)*5/9;
                } else if (to == Tconverter.Unit.KELVIN) {
                    constant =((input-32)*5/9) + 273.15;
                }
                break;
            case KELVIN:
                if (to == Tconverter.Unit.CELSIUS) {
                    constant = input - 273.15;
                } else if (to == Tconverter.Unit.FAHRENHEIT) {
                    constant = ((input*1.8) + 32) - 273.15 ;
                }
                break;

        }

        multiplier = constant;
    }

    // Convert the unit!
    public double convert() {
        return multiplier;
    }
}
