package com.dd;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.xml.ws.ServiceMode;
import java.util.logging.Logger;

@Component
public class JustService {

    private final org.slf4j.Logger log = LoggerFactory.getLogger(this.getClass());


    @PostConstruct
    public void hello(){
        System.out.println("----------ff--------");
        log.error("----------ff--------");
    }

}
