package com.lnt.mycalculator;

public class Wconverter {
    public enum Unit {
        KILOGRAM,
        GRAMS,
        MILIGRAMS,
        OUNCE,
        POUND;



        public static Wconverter.Unit fromString(String text) {
            if (text != null) {
                for (Wconverter.Unit unit : Wconverter.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;

    public Wconverter(Wconverter.Unit from, Wconverter.Unit to) {
        double constant = 1;
        // Set the multiplier, else if fromUnit = toUnit, then it is 1
        switch (from) {
            case KILOGRAM:
                if (to == Wconverter.Unit.GRAMS) {
                    constant = 1000.0;
                } else if (to == Wconverter.Unit.OUNCE) {
                    constant = 35.274;
                } else if (to == Wconverter.Unit.POUND) {
                    constant = 2.205;
                } else if (to == Wconverter.Unit.MILIGRAMS) {
                    constant = 1e+6;
                }
                break;
            case GRAMS:
                if (to == Wconverter.Unit.KILOGRAM) {
                    constant = 0.001;
                } else if (to == Wconverter.Unit.OUNCE) {
                    constant = 0.03527;
                } else if (to == Wconverter.Unit.POUND) {
                    constant = 0.00220462;
                } else if (to == Wconverter.Unit.MILIGRAMS) {
                    constant = 1000;
                }
                break;
            case MILIGRAMS:
                if (to == Wconverter.Unit.KILOGRAM) {
                    constant = 1e-6;
                } else if (to == Wconverter.Unit.GRAMS) {
                    constant = 0.001;
                } else if (to == Wconverter.Unit.OUNCE) {
                    constant = 3.5274e-5;
                } else if (to == Wconverter.Unit.POUND) {
                    constant = 2.2046e-6;
                }
                break;
            case OUNCE:
                if (to == Wconverter.Unit.KILOGRAM) {
                    constant = 0.0283495;
                } else if (to == Wconverter.Unit.GRAMS) {
                    constant = 28.3495;
                } else if (to == Wconverter.Unit.MILIGRAMS) {
                    constant = 28349.5;
                } else if (to == Wconverter.Unit.POUND) {
                    constant = 0.0625;
                }
                break;
            case POUND:
                if (to == Wconverter.Unit.KILOGRAM) {
                    constant = 0.453592;
                } else if (to == Wconverter.Unit.GRAMS) {
                    constant = 453.592;
                } else if (to == Wconverter.Unit.MILIGRAMS) {
                    constant = 453592;
                } else if (to == Wconverter.Unit.OUNCE) {
                    constant = 16;
                }
                break;

        }

        multiplier = constant;
    }

    // Convert the unit!
    public double convert(double input) {
        return input * multiplier;
    }
}
