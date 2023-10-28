package com.streamlearning.streams.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties
public class PersonEntity {
    @Column(name = "FULL")
    public String fullName;
    @Id
    @Column(name = "AGE")
    public int age;

}
