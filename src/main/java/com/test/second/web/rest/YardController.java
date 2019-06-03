package com.test.second.web.rest;


import com.test.second.domain.Task;
import com.test.second.domain.Util.Result;
import com.test.second.domain.Util.ResultTool;
import com.test.second.domain.Yard;
import com.test.second.service.TaskService;
import com.test.second.service.YardService;
import io.github.jhipster.web.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class YardController {

    @Autowired
    TaskService taskService;



    @Resource
    YardService yardService;

    @GetMapping(value = "yard/{id}")
    public ResponseEntity<Yard>  getYardById(@PathVariable Integer id){
        Yard yard = yardService.selectById(id);
        ResponseEntity<Yard> a = new ResponseEntity(yard, HttpStatus.OK);
        return a;
//        return  yard.toString();
    }

    @GetMapping(value = "cccc/{id}")
    public String ccc(@PathVariable Integer id){
        Yard yard = yardService.selectById(id);

        return yard.toString();
//        return  yard.toString();
    }

    @GetMapping(value = "rrr/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<Yard> crrcc(@PathVariable Integer id){
        Yard yard = yardService.selectById(id);

        return ResultTool.successData(yard);
//        return  yard.toString();
    }

    @GetMapping("/aaa/{id}")
    public ResponseEntity<Task> getTask(@PathVariable Long id) {

        Optional<Task> task = taskService.findOne(id);
        return ResponseUtil.wrapOrNotFound(task);
    }
}
