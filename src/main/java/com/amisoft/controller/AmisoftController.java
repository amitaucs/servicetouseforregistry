package com.amisoft.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by amitdatta on 20/05/17.
 */

@EnableDiscoveryClient
@RestController
public class AmisoftController {

    @RequestMapping(method = RequestMethod.GET, value = "/amisoft")
    String welcome (
                                 @RequestHeader("x-forwarded-host") Optional<String> host,
                                 @RequestHeader("x-forwarded-port") Optional<Integer> port) {

        host.ifPresent(h -> System.out.println("host = " + h));
        port.ifPresent(p -> System.out.println("port = " + p));

        String welcome = "Welcome to Amisoft :" + "AMIT";

        return welcome;
    }
}
