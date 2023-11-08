package com.ilkay.enums;

public enum Gender {
    MALE("Erkek"), FEMALE("Kadın");
    private final String value;

    Gender(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
