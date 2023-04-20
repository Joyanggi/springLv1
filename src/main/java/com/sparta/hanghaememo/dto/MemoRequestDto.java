package com.sparta.hanghaememo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

@Getter
public class MemoRequestDto {
    private String username;
    private String contents;
    @JsonIgnore
    private String password;
    private String title;
}