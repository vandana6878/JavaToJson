package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
class User {

    public String name;
    public String email;
    private String[] roles;
    private boolean admin;

    public User() {
    }

    public User(String name, String email, String[] roles, boolean admin) {
        this.name = name;
        this.email = email;
        this.roles = roles;
        this.admin = admin;
    }



    // getters and setters, toString() .... (omitted for brevity)
}

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        try {
            // create user object
            User user = new User("John Doe", "john.doe@example.com",
                    new String[]{"Member", "Admin"}, true);

            // convert user object to JSON
            String json = new ObjectMapper().writeValueAsString(user);

            // print JSON string
            System.out.println(json);

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}