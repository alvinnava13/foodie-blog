package edu.greenriver.it.foodieblog.services;

import edu.greenriver.it.foodieblog.model.User;
import edu.greenriver.it.foodieblog.repositories.IUserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    private IUserRepository userRepository;

    public UserService(IUserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public Iterable<User> getUsers()
    {
        return userRepository.findAll();
    }

    public User getUser(String username)
    {
        return userRepository
                .getUserByUsername(username)
                .orElse(null);
    }
}
