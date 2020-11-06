package com.lnt.mycalculator;

public class Cconverter {
    public enum Unit {
        US_DOLLAR,
        RUPEE,
        EURO,
        POUND_STERLING,
        UAE_DIRHAM,
        BITCOIN,
        ETHER;
        public static Cconverter.Unit fromString(String text) {
            if (text != null) {
                for (Cconverter.Unit Unit : Cconverter.Unit.values()) {
                    if (text.equalsIgnoreCase(Unit.toString())) {
                        return Unit;
                    }
                }
            }
            throw new IllegalArgumentException("Cannot find a value for " + text);
        }
    }
    private final double multiplier;
    public Cconverter(Cconverter.Unit from, Cconverter.Unit to) {
        double constant = 1;
        switch (from) {
            case US_DOLLAR:
                if (to == Cconverter.Unit.RUPEE) {
                    constant = 73.29;
                } else if (to == Cconverter.Unit.UAE_DIRHAM) {
                    constant = 3.67;
                } else if (to == Cconverter.Unit.EURO) {
                    constant = 0.85;
                } else if (to == Cconverter.Unit.POUND_STERLING) {
                    constant = 0.77;
                } else if (to == Cconverter.Unit.BITCOIN) {
                    constant = 0.000087;
                } else if (to == Cconverter.Unit.ETHER) {
                    constant = 0.0026;
                }
                break;
            case RUPEE:
                if (to == Cconverter.Unit.US_DOLLAR) {
                    constant = 0.014;
                } else if (to == Cconverter.Unit.UAE_DIRHAM) {
                    constant = 0.050;
                } else if (to == Cconverter.Unit.EURO) {
                    constant = 0.012;
                } else if (to == Cconverter.Unit.POUND_STERLING) {
                    constant = 0.010;
                } else if (to == Cconverter.Unit.BITCOIN) {
                    constant = 0.0000012;
                } else if (to == Unit.ETHER){
                    constant = 0.000035;
                }
                break;
            case UAE_DIRHAM:
                if (to == Cconverter.Unit.US_DOLLAR) {
                    constant = 0.27;
                } else if (to == Cconverter.Unit.RUPEE) {
                    constant = 19.95;
                } else if (to == Cconverter.Unit.EURO) {
                    constant = 0.23;
                } else if (to == Cconverter.Unit.POUND_STERLING) {
                    constant = 0.21;
                } else if (to == Cconverter.Unit.BITCOIN) {
                    constant = 0.000024;
                } else if (to == Unit.ETHER){
                    constant = 0.00071;
                }
                break;
            case EURO:
                if (to == Cconverter.Unit.US_DOLLAR) {
                    constant = 1.18;
                } else if (to == Cconverter.Unit.RUPEE) {
                    constant = 86.40;
                } else if (to == Cconverter.Unit.UAE_DIRHAM) {
                    constant = 4.33;
                } else if (to == Cconverter.Unit.POUND_STERLING) {
                    constant = 0.90;
                } else if (to == Cconverter.Unit.BITCOIN) {
                    constant = 0.00010;
                } else if (to == Unit.ETHER) {
                    constant = 0.0031;
                }
                break;
            case POUND_STERLING:
                if (to == Cconverter.Unit.US_DOLLAR) {
                    constant = 1.30;
                } else if (to == Cconverter.Unit.RUPEE) {
                    constant = 95.54;
                } else if (to == Cconverter.Unit.UAE_DIRHAM) {
                    constant = 4.79;
                } else if (to == Cconverter.Unit.EURO) {
                    constant = 1.11;
                } else if (to == Cconverter.Unit.BITCOIN) {
                    constant = 0.00011;
                } else if (to == Unit.ETHER) {
                    constant = 0.0034;
                }
                break;
            case BITCOIN:
                if (to == Cconverter.Unit.US_DOLLAR) {
                    constant = 11526.50;
                } else if (to == Cconverter.Unit.RUPEE) {
                    constant = 844919.89;
                } else if (to == Cconverter.Unit.UAE_DIRHAM) {
                    constant = 42348.49;
                } else if (to == Cconverter.Unit.EURO) {
                    constant = 0.014;
                } else if (to == Cconverter.Unit.POUND_STERLING) {
                    constant = 8845.84;
                } else if (to == Unit.ETHER) {
                    constant = 29.89;
                }
                break;
            case ETHER:
                if (to == Cconverter.Unit.US_DOLLAR) {
                    constant = 384.78;
                } else if (to == Cconverter.Unit.RUPEE) {
                    constant = 28256.58;
                } else if (to == Cconverter.Unit.UAE_DIRHAM) {
                    constant = 1416.26;
                } else if (to == Cconverter.Unit.EURO) {
                    constant = 327.17;
                } else if (to == Cconverter.Unit.POUND_STERLING) {
                    constant = 295.90;
                } else if (to == Unit.BITCOIN) {
                    constant = 0.033;
                }
                break;
        }
        multiplier = constant;
    }
    public double convert(double input) {
        return input * multiplier;
    }
}
