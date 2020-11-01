package com.example.barogotest01.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HelloWorldController {


  @GetMapping(value = "/barogo/hello")
  public String test() {

    log.info(">>>>>>>>>>>>>> helloworld");

    return "hello";
  }
}
