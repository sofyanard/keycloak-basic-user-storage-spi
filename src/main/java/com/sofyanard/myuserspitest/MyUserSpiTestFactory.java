package com.sofyanard.myuserspitest;

import org.keycloak.component.ComponentModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.storage.UserStorageProviderFactory;

public class MyUserSpiTestFactory  implements UserStorageProviderFactory<MyUserSpiTest> {

    public static final String PROVIDER_NAME = "myuserspitest";
    MyUserSpiStore userStore = new MyUserSpiStore();

    @Override
    public String getId() {
        return PROVIDER_NAME;
    }

    @Override
    public MyUserSpiTest create(KeycloakSession session, ComponentModel model) {
        return new MyUserSpiTest(session, model, userStore);
    }
    
    
    
    



    
}