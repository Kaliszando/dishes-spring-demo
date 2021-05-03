package pl.demo.dishes.dishes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.demo.dishes.dishes.models.Meal;
import pl.demo.dishes.dishes.services.MealsService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class MealsController {

    @Autowired
    private MealsService mealsService;

    @GetMapping(path = "/meals", produces = APPLICATION_JSON_VALUE)
    public List<Meal> getAllMeals() {
        return mealsService.getAllMeals();
    }

    @GetMapping(path = "/meals/{id}", produces = APPLICATION_JSON_VALUE)
    public Meal getMeal(@PathVariable long id) {
        return mealsService.getMeal(id);
    }

    @PostMapping(path = "/meals", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public Meal addMeal(@RequestBody Meal meal) {
        return mealsService.addMeal(meal);
    }

    @PutMapping(path = "/meals/{id}")
    public Meal updateMeal(@PathVariable long id, @RequestBody Meal meal) {
        return mealsService.updateMeal(meal);
    }

    @DeleteMapping(path = "/meals/{id}")
    public void deleteMeal(@PathVariable long id) {
        mealsService.removeMeal(id);
    }
}
