package com.sample.demo.controller;


import com.sample.demo.model.DemoReq;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> getMessage(@RequestParam("value") String msg) {
     return new ResponseEntity<>("Hello Demo" + msg, HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method=RequestMethod.POST)
    public ResponseEntity<?> createMessage(@RequestBody DemoReq demoReq) {
     return new ResponseEntity<>(demoReq, HttpStatus.OK);
    }

}
