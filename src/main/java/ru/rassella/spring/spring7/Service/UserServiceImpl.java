package ru.rassella.spring.spring7.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.rassella.spring.spring7.DAO.UserDAO;
import ru.rassella.spring.spring7.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional(readOnly = true)
    public List<User> getAll() {
        return userDAO.getAll();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
    userDAO.saveUser(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userDAO.deleteUser(id);
    }
}