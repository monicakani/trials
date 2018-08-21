package com.navis.core;

public class User
{
    String userName;
    String userMail;

    public User(){}

    public User(String userName, String userMail){
        this.userName = userName;
        this.userMail = userMail;
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserMail(){
        return userMail;
    }

    public void setUserMail(String userMail){
        this.userMail = userMail;
    }

    public boolean validateMail()
    {
        if(userMail.length()>8)
            return false;
        else
            return true;
    }
}
