package com.user.ecommerce_userservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first-service")
@Slf4j
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome() {
        log.info("welcome logo!");
        return "hihi";
    }

    @GetMapping(value = "/message")
    public String message(@RequestHeader(value = "first-request", required = false)String header) {
        log.info("message function called");
        log.info("header: " + header);
        return header;
    }
}
