package com.example.bean.bean.service;
import java.util.ArrayList;
import java.util.List;
import com.example.bean.bean.entity.User;

public class UserService {
    private static List list = new ArrayList<>();

    static {
        User u = new User("User 1");
        list.add(u);

        u = new User("User 2");
        list.add(u);

        u = new User("User 3");
        list.add(u);
    }

    public List getList () {
        return list;
    }
}
