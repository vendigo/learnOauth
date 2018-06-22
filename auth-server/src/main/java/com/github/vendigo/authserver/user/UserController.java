package com.github.vendigo.authserver.user;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/userinfo")
    public Principal userinfo(Principal principal) {
        return principal;
    }
}
