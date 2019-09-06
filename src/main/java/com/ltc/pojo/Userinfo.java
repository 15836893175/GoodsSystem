package com.ltc.pojo;

public class Userinfo {
    private Integer ids;
    private String username;
    private String password;

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "ids=" + ids +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
