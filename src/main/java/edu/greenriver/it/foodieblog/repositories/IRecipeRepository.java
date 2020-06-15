package edu.greenriver.it.foodieblog.repositories;

import edu.greenriver.it.foodieblog.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRecipeRepository extends CrudRepository<Recipe, Long>
{

}
