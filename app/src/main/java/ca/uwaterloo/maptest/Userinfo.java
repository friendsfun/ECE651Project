package ca.uwaterloo.maptest;

/**
 * Created by serena on 2016-10-15.
 */
public class Userinfo {
    private String username;
    private String password;

    public Userinfo() {

    }

    public Userinfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
