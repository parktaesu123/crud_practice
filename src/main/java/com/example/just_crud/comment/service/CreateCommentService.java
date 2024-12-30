package com.example.just_crud.comment.service;

import com.example.just_crud.comment.dto.request.CommentRequest;
import com.example.just_crud.comment.entity.Comment;
import com.example.just_crud.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CreateCommentService {
    private final CommentRepository commentRepository;

    @Transactional
    public void createComment(CommentRequest commentRequest) {
        Comment comment = Comment.builder()
                .content(commentRequest.getContent())
                .userName(commentRequest.getUserName())
                .build();

        commentRepository.save(comment);

    }
}
