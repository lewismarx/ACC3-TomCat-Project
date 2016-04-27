package edu.acc.java;

/**
 * Created by lewis on 4/25/16.
 */
public class ServletBeanCookie {
    private String cookiename;
    private String cookiecontent;
    private String maxage;
    private int maxagenumber;


    public ServletBeanCookie() {
        cookiename = "";
        cookiecontent = "";
        maxage = "";
        maxagenumber = 0;
    }

    public ServletBeanCookie(String name, String content, int MaxAgeNum) {
        this.cookiename = name;
        this.cookiecontent = content;
        this.maxage = String.valueOf(MaxAgeNum);
        this.maxagenumber = MaxAgeNum;

    }

    public int getMaxagenumber() {
        return maxagenumber;
    }

    public String getCookiename() {
        return cookiename;
    }

    public String getCookiecontent() {
        return cookiecontent;
    }

    public String getMaxage() {
        return maxage;
    }
}
