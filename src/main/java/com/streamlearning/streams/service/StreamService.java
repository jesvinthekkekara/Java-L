package com.streamlearning.streams.service;

import com.streamlearning.streams.dto.Person;
import com.streamlearning.streams.utils.Gender;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StreamService {
    public List<Person> getPersonData(){
        List<Person> personData=new ArrayList<>();
        Person p=new Person();
        p.setGender(Gender.FEMALE);
        p.setFullName("Jesv");
        p.setAge(12);
        personData.add(p);


        return personData;
    }

    public List<Integer> getDataService(){
        List<Integer> values=List.of(11,10,9,8,7,6,5,4,3,2);
        return values.stream().map(p->p*2).collect(Collectors.toList());
    }


}
