package com.luv2code.springdemo.mvc;


import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    @Min(value = 0, message = "must be greather than or qual to zero")
    @Max(value = 10, message = "must be less than or equal to 10")
    @NotNull(message="is required")
    private Integer freePasses;

    @NotNull(message="is required")
    @Size(min=2, message="is required")
    private String lastName;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 char/digits")
    private String postalCode;

    public String getPostalCode() { return postalCode; }

    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

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

    public Integer getFreePasses() { return freePasses; }

    public void setFreePasses(Integer freePasses) { this.freePasses = freePasses; }
}
