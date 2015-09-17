package com.holler.hollerapp.DTO;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class UserDTO {


    private final String name ;

    @NotNull
    @Email
    private final String email_id;

    @NotNull
    //@Pattern(regexp = "[0-9]")
    private final String phoneNumber;



    @JsonCreator
    public UserDTO(@JsonProperty("name") String name,@JsonProperty("email_id") String email_id,@JsonProperty("phoneNumber") String phoneNumber){
        this.name = name;
        this.email_id = email_id;
        this.phoneNumber = phoneNumber;
    }



    public String getEmail_id() {
        return email_id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
