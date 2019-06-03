package com.test.second.web.rest;

import com.test.second.domain.Job;
import com.test.second.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/test/{id}")
    public Job getJob(@PathVariable Long id) {
        return testService.selectById(id);
    }
}
