package com.sofyanard.myuserspitest;

import java.util.HashMap;

public class MyUserSpiStore {
    private HashMap<String, User> hashMapStorage;

    public MyUserSpiStore() {
        this.hashMapStorage = new HashMap<>(3);
        this.hashMapStorage.put("sofyan", new User("sofyan", "P455w0rd!"));
    }

    public User getUser(String username){
        return this.hashMapStorage.get(username);
    }
}
