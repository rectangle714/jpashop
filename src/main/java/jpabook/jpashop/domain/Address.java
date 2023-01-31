package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
@Data
public class Address {

    private String city;
    private String street;
    private String zipcode;

}
