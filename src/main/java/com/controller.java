package com;

import com.entity.User;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hy  on 2018/4/13.
 */
@RestController
public class controller {

    @GetMapping(value = "/a")
    @JsonView(User.aInterFace.class)
    public User a() {
        return null;
    }

    @JsonView(User.bInterFace.class)
    public User b() {
        return null;
    }
}
