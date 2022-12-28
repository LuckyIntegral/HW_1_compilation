package com.google.service;

public class SyntaxRules {
    public static final String DEFAULT_CAR_BRAND = "No brand";
    public static final String DEFAULT_CAR_COUNTRY = "Unspecified";
    public static final String DEFAULT_CAR_FUEL = "No info";
    public static final String DEFAULT_CAR_COLOR = "No color info";
    public static final String DEFAULT_GARAGE_NAME = "Unspecified";
    public static final String DEFAULT_GARAGE_ADDRESS = "No address";
    public static final int DEFAULT_GARAGE_CAPACITY = 10;

    public boolean carBrandIsInvalid(String value) {
        String regex = "^[A-zА-яїЇєЄґҐіІ -]{" + value.length() +"}$";
        return !value.matches(regex);
    }

    public boolean carCountryIsInvalid(String value) {
        String regex = "^[A-zА-яїЇєЄґҐіІ -]{" + value.length() +"}$";
        return !value.matches(regex);
    }

    public boolean carFuelIsInvalid(String value) {
        String regex = "^[A-zА-яїЇєЄґҐіІ]{" + value.length() +"}$";
        return !value.matches(regex);
    }

    public boolean carColorIsInvalid(String value) {
        String regex = "^[A-zА-яїЇєЄґҐіІ -]{" + value.length() +"}$";
        return !value.matches(regex);
    }

    public boolean garageNameIsInvalid(String value) {
        String regex = "^[A-zА-яїЇєЄґҐіІ -]{" + value.length() +"}$";
        return !value.matches(regex);
    }

    public boolean garageAddressIsInvalid(String value) {
        String regex = "^[A-zА-яїЇєЄґҐіІ -]{" + value.length() +"}$";
        return !value.matches(regex);
    }

    public boolean garageCapacityIsInvalid(int value) {
        return value <= 0 || value > 50;
    }
}
