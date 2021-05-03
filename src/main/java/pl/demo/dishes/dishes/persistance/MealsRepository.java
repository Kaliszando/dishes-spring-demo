package pl.demo.dishes.dishes.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.demo.dishes.dishes.models.Meal;

@Repository
public interface MealsRepository extends JpaRepository<Meal, Long> {
}
