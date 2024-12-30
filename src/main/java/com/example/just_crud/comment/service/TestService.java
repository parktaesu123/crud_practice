package com.example.just_crud.comment.service;

import com.example.just_crud.comment.entity.Comment;
import com.example.just_crud.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final CommentRepository commentRepository;

    public List<Comment> query() {
        return commentRepository.findAll();
    }
}
