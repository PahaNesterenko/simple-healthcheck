package com.dd;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class CustomHealthCheckResource {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private final org.slf4j.Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/health")
    @ResponseBody
    public ResponseEntity<String> check() {

        System.out.println("----------fff--------");
        log.error("----------fff--------");

        return new ResponseEntity<>("Everything is ok" , HttpStatus.OK);
    }

}
