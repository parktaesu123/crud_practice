package com.example.just_crud.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String userName;

    public Board(String title, String content, String userName) {
        this.title = title;
        this.content = content;
        this.userName = userName;
    }

    public void updateBoard(String title, String content) {
        this.title = title;
        this.content = content;
    }


}
