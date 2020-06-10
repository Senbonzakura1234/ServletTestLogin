package com.auth.model;

public class ConstValue {
    public static String LoginTitle = "Login";
    public static String DashboardTitle = "Dashboard";
    public static String ProfileTitle = "Profile";
    public static String[] redirectPath = {"/login", "/register"};
    public static String TagUsername = "username";
    public static String TagPassword = "password";
    public static String TagPhone = "phone";
    public static String TagGender = "genders";

    public enum GenderEnum {
        MALE,
        FEMALE,
        UNKNOWN
    }

    public static String GenderChecked = "checked";

    public static String LoginRoute = "login";
    public static String DashboardRoute = "dashboard";
    public static String ProfileRoute = "profile";
    public static String LogoutRoute = "logout";
}
