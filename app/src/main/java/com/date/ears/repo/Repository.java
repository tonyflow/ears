package com.date.ears.repo;

import java.util.List;

public interface Repository<T> {

    T get(String id);

    void save(T t);


}
