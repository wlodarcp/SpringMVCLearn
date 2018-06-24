package com.luv2code.springdemo.mvc;


import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private String[] operatingSystems;

    private LinkedHashMap<String,String> countryOptions;
    private LinkedHashMap<String, String> favoriteLanguageOptions;
    private LinkedHashMap<String,String> operatingSystemsOptions;

    public Student(){
        countryOptions = new LinkedHashMap<>();
        favoriteLanguageOptions = new LinkedHashMap<>();
        operatingSystemsOptions = new LinkedHashMap<>();

        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");

        operatingSystemsOptions.put("Linux", "Linux");
        operatingSystemsOptions.put("Windows", "Windows");
        operatingSystemsOptions.put("Unix", "Unix");
        operatingSystemsOptions.put("IOS", "IOS");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

    public LinkedHashMap<String, String> getOperatingSystemsOptions() {
        return operatingSystemsOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
