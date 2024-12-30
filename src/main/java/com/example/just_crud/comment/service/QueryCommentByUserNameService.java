package com.example.just_crud.comment.service;

import com.example.just_crud.comment.dto.response.CommentResponse;
import com.example.just_crud.comment.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryCommentByUserNameService {
    private final CommentRepository commentRepository;

    public List<CommentResponse> queryCommentByUserName(String userName) {
        return commentRepository.findByUserName(userName)
                .stream().map(comment -> new CommentResponse(comment))
                .collect(Collectors.toList());
    }
}
