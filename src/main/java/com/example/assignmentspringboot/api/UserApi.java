package com.example.assignmentspringboot.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UserApi {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloUser () {
        return "hello account with role user";
    }
}
