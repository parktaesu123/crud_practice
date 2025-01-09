package com.example.just_crud.comment.service;

import com.example.just_crud.comment.dto.request.CommentRequest;
import com.example.just_crud.comment.entity.Comment;
import com.example.just_crud.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateCommentService {
    private final CommentRepository commentRepository;


    @Transactional
    public void updateComment(CommentRequest request, Long id) {
        Comment comment = commentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("댓글 없음"));

        comment.update(request.getContent());
    }
}
