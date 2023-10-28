package com.streamlearning.streams.dto;

import com.streamlearning.streams.service.StreamService;
import com.streamlearning.streams.utils.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Person {
    public String fullName;
    public  int age;
    public Gender gender;
}
