package com.jett.chambor.config.controller;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : YeJT
 * @date : 2023-10-09 09:54
 * @Description: TODO
 */
@Api
@RestController
public class TestController {

    @GetMapping("api/v1/test/hello")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("hello world");
    }

}
