package edu.greenriver.it.foodieblog.repositories;

import edu.greenriver.it.foodieblog.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends CrudRepository<User, Long>
{
    Optional<User> getUserByUsername(String username);
}
