package com.example.co227_project.User;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User {

    @Id
    private String id;

    private String Username;

    private String Password;

    private String Serverity;

    private String Type;

    public User() {
    }

    public User(String username, String password , String serverity , String type) {
        Username = username;
        Password = password;
        Serverity = serverity;
        Type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getServerity() {
        return Serverity;
    }

    public void setServerity(String serverity) {
        Serverity = serverity;
    }
}