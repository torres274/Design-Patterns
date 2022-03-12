package com.example.design.pattern.builder;

// Constructs complex objects using step-by-step approach.
public class Main {
    public static void main(String[] args) {
        User user1 = User.builder()
                .firstName("Daniel")
                .age(25)
                .phone("123456789")
                .build();
        System.out.println(user1);

        User user2 = User.builder()
                .firstName("Daniel")
                .age(25)
                .build();
        System.out.println(user2);

        User user3 = User.builder()
                .firstName("Daniel")
                .build();
        System.out.println(user3);
    }
}
