package com.example.just_crud.comment.service;

import com.example.just_crud.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCommentService {
    private final CommentRepository commentRepository;

    public void deleteComment(String userName) {
        commentRepository.DeleteByUserName(userName);
    }
}
