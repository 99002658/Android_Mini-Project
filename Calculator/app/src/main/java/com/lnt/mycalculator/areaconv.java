package com.lnt.mycalculator;

public class areaconv {
    public enum Unit {
        Square_Kilometers,
        Square_Miles,
        Square_Inches,
        Square_Centimeters,
        Square_Millimeters,
        Square_Feet,
        Square_Meters;

        public static areaconv.Unit fromString(String text) {
            if (text != null) {
                for (areaconv.Unit unit : areaconv.Unit.values()) {
                    if (text.equalsIgnoreCase(unit.toString())) {
                        return unit;
                    }
                }
            }

            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }

    private final double multiplier;

    public areaconv(Unit from, Unit to) {
        double constant = 1;
        switch (from) {
            case Square_Inches:
                if (to == Unit.Square_Centimeters) {
                    constant = 6.4516;
                } else if (to == Unit.Square_Feet) {
                    constant = 0.00694444;
                } else if (to == Unit.Square_Meters) {
                    constant = 0.00064516;
                } else if (to == Unit.Square_Miles) {
                    constant = 2.491e-10;
                } else if (to == Unit.Square_Kilometers) {
                    constant = 6.4516e-10;
                }
                break;
            case Square_Centimeters:
                if (to == Unit.Square_Inches) {
                    constant = 0.155;
                } else if (to == Unit.Square_Feet) {
                    constant = 0.00107639;
                } else if (to == Unit.Square_Meters) {
                    constant = 1e-4;
                } else if (to == Unit.Square_Miles) {
                    constant = 3.861e-11;
                } else if (to == Unit.Square_Kilometers) {
                    constant = 1e-10;
                }
                break;
            case Square_Feet:
                if (to == Unit.Square_Inches) {
                    constant = 144;
                } else if (to == Unit.Square_Centimeters) {
                    constant = 929.03;
                } else if (to == Unit.Square_Meters) {
                    constant = 0.092903;
                } else if (to == Unit.Square_Miles) {
                    constant = 3.587e-8;
                } else if (to == Unit.Square_Kilometers) {
                    constant = 9.2903e-8;
                }
                break;
            case Square_Meters:
                if (to == Unit.Square_Inches) {
                    constant = 1550;
                } else if (to == Unit.Square_Centimeters) {
                    constant = 10000;
                } else if (to == Unit.Square_Feet) {
                    constant = 10.7639;
                } else if (to == Unit.Square_Miles) {
                    constant = 3.861e-7;
                } else if (to == Unit.Square_Kilometers) {
                    constant = 1e-6;
                }
                break;
            case Square_Miles:
                if (to == Unit.Square_Inches) {
                    constant = 4.014e+9;
                } else if (to == Unit.Square_Centimeters) {
                    constant = 2.59e+10;
                } else if (to == Unit.Square_Feet) {
                    constant = 2.788e+7;
                } else if (to == Unit.Square_Meters) {
                    constant = 2.59e+6;
                } else if (to == Unit.Square_Kilometers) {
                    constant = 2.58999;
                }
                break;
            case Square_Kilometers:
                if (to == Unit.Square_Inches) {
                    constant = 1.55e+9;
                } else if (to == Unit.Square_Centimeters) {
                    constant = 1e+10;
                } else if (to == Unit.Square_Feet) {
                    constant = 1.076e+7;
                } else if (to == Unit.Square_Meters) {
                    constant = 1e+6;
                } else if (to == Unit.Square_Miles) {
                    constant = 0.386102;
                }
                break;
        }
        multiplier = constant;
    }
    public double convert(double input) {
        return input * multiplier;
    }
}
