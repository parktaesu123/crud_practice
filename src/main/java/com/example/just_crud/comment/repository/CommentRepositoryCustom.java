package com.example.just_crud.comment.repository;

import com.example.just_crud.comment.entity.Comment;

import java.util.List;

public interface CommentRepositoryCustom {
    List<Comment> findAllComments();

    List<Comment> findByUserName(String userName);

    void DeleteByUserName(String userName);

}
