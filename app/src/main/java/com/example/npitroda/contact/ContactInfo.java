package com.example.npitroda.contact;

/**
 * Created by NPitroda on 1/13/2017.
 */


public class ContactInfo {
    protected String name;
    protected String surname;
    protected String email;
    protected static final String NAME_PREFIX = "Name_";
    protected static final String SURNAME_PREFIX = "Surname_";
    protected static final String EMAIL_PREFIX = "email_";




    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public static String getNamePrefix() {
        return NAME_PREFIX;
    }

    public static String getSurnamePrefix() {
        return SURNAME_PREFIX;
    }

    public static String getEmailPrefix() {
        return EMAIL_PREFIX;
    }
}
