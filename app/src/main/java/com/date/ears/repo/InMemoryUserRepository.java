package com.date.ears.repo;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUserRepository implements Repository<User> {

    Map<String, User> store = new HashMap<>();

    @Override
    public User get(String id) {
        return store.get(id);
    }

    @Override
    public void save(User user) {
        store.put(user.username, user);
    }
}
