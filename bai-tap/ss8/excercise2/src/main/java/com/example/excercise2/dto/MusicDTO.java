package com.example.excercise2.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class MusicDTO implements Validator {
    private int id;
    @NotBlank(message = "Không được để trống")
    @Size(max = 800,message = "Không nhập quá 800 ký tự")
    @Pattern(regexp = "[a-zA-Z0-9]*",message = "Không nhập kí tự đặc biệt")
    private String name;
    @NotBlank(message = "Không được để trống")
    @Size(max = 300,message = "Không nhập quá 300 ký tự")
    @Pattern(regexp = "[a-zA-Z0-9]*",message = "Không nhập kí tự đặc biệt")
    private String singer;
    @NotBlank(message = "Không được để trống")
    @Size(max = 1000,message = "Không nhập quá 1000 ký tự")
    @Pattern(regexp = "[a-zA-Z0-9]*",message = "Không nhập kí tự đặc biệt")
    private String type;

    public MusicDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
