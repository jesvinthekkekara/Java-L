package com.streamlearning.streams.controller;

import com.streamlearning.streams.dto.Person;
import com.streamlearning.streams.service.StreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StreamController {

    @Autowired
    StreamService streamService;

    @GetMapping("/allData")
    public List<Person> getAllPersonData(){
        return streamService.getPersonData();
    }

    @GetMapping("data")
    public List<Integer> getData(){
        return streamService.getDataService();
    }


}


