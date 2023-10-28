package com.streamlearning.streams.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    private int addressId;

    private String street;

    private long zipCode;
}
