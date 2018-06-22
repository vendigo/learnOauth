package com.github.vendigo.jwtsecured.movie;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/movies")
    public List<Movie> movies() {
        final Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        return Arrays.asList(new Movie("Deadpool 2", 2018), new Movie("Incredibles 2 ", 2018));
    }
}
