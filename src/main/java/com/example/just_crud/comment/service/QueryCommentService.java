package com.example.just_crud.comment.service;

import com.example.just_crud.comment.dto.response.CommentResponse;
import com.example.just_crud.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryCommentService {
    private final CommentRepository commentRepository;

    public List<CommentResponse> queryComment() {
        return commentRepository.findAllComments()
                .stream()
                .map(comment -> new CommentResponse(comment))
                .collect(Collectors.toList());
    }
}
