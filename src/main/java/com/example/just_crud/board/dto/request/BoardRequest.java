package com.example.crud_practice.board.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardRequest {
    private String title;
    private String content;
    private String userName;
}
