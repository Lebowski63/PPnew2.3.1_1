package web.config.dao;

import web.config.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    User getById(int id);
    void save(User user);

    void update(int id, User userUpdate);
    void delete(int id);
}
