package com.example.design.pattern.singleton;

// Ensures that at most only one instance of an object exists throughout application.
public class SingletonClass {

    private static SingletonClass INSTANCE;

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }

}
