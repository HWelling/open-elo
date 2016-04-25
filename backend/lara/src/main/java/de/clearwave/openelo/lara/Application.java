package de.clearwave.openelo.lara;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by hwelling on 25.04.16.
 */

@SpringBootApplication
public class Application {

    Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(Application.class, args);
    }

}
