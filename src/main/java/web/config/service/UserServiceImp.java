package web.config.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.config.dao.UserDao;
import web.config.model.User;

import java.util.List;
@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional(readOnly = true)
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update(int id, User userUpdate) {
        userDao.update(id, userUpdate);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }


}
