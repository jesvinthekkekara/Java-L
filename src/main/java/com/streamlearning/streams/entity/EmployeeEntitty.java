package com.streamlearning.streams.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="EMPLOYEE_TABLE")
public class EmployeeEntitty {

    @Id
    private int employeeId;

    private String name;


}
