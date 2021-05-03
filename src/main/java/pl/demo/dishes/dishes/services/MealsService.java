package pl.demo.dishes.dishes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.demo.dishes.dishes.models.Meal;
import pl.demo.dishes.dishes.persistance.MealsRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MealsService {

    private MealsRepository mealsRepository;

    @Autowired
    public MealsService(MealsRepository mealsRepository) {
        this.mealsRepository = mealsRepository;
    }

    public Meal updateMeal(Meal meal) {
        return mealsRepository.save(meal);
    }

    public Meal addMeal(Meal meal) {
        return mealsRepository.save(meal);
    }

    public List<Meal> getAllMeals() {
        return mealsRepository.findAll();
    }

    public Meal getMeal(long id) {
        return mealsRepository.findById(id).orElse(null);
    }

    public void removeMeal(long id) {
        mealsRepository.deleteById(id);
    }
}
