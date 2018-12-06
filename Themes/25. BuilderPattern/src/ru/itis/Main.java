package ru.itis;

public class Main {

    public static void main(String[] args) {
        User user  = User.builder()
                .id(10L)
                .email("sidiokov.marsel@gmail.com")
                .age(24)
                .build();
    }
}
