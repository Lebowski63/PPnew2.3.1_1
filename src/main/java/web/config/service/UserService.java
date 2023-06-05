package web.config.service;

import web.config.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getById(int id);
    void save(User user);
    void update(int id, User userUpdate);
    void delete(int id);

}
