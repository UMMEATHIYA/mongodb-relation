package com.example.demo.documents;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {

    private String addressLineOne;
    private String addressLineTwo;
    private String city;
    private String country;

    public Address(
            final String addressLineOne,
            final String addressLineTwo,
            final String city,
            final String country) {
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.city = city;
        this.country = country;
    }
}
