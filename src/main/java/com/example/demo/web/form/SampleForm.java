package com.example.demo.web.form;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class SampleForm {

    @NotBlank
    @Size(min = 1,max = 10)
    private String userId;
    @NotBlank
    private String userName;
    @NotBlank
    @Email
    private String emailAddress;
    @NotBlank
    private String password;
}
