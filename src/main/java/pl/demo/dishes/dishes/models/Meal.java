package pl.demo.dishes.dishes.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Meal {

    private String name;
    private String description;
    private int cost;
}
