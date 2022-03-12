package com.example.design.pattern.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {
    private final String firstName;
    private final int age;
    private final String phone;
}
