package com.sairaj.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sairaj.response.ApiResponse;

@RestController
public class HomeController {

    @GetMapping("")
    public ResponseEntity<ApiResponse> homeController(){
        ApiResponse res=new ApiResponse("welcome to user service",true);
        return new ResponseEntity<ApiResponse>(res,HttpStatus.ACCEPTED);
    }

}
