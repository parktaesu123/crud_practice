package com.example.just_crud.comment.repository;

import com.example.just_crud.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> , CommentRepositoryCustom{
}
