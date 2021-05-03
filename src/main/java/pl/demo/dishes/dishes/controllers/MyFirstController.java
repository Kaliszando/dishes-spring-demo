package pl.demo.dishes.dishes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.demo.dishes.dishes.models.Meal;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class MyFirstController {

    @GetMapping(path = "/hello", produces = APPLICATION_JSON_VALUE)
    public String hello() {
        return new Meal("Pizza", "Best pizza in Lodz", 26).toString();
    }
}
