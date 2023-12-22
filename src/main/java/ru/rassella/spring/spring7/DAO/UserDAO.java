package ru.rassella.spring.spring7.DAO;



import ru.rassella.spring.spring7.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAll();

//    void delete(User user);
//
//
//    void update(User user);

    void saveUser(User user);
    User getUserById(long id);

    void deleteUser(long id);
}
