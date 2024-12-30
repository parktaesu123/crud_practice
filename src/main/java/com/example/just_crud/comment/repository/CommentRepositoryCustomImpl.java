package com.example.just_crud.comment.repository;

import com.example.just_crud.comment.entity.Comment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class CommentRepositoryCustomImpl implements CommentRepositoryCustom{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Comment> findAllComments() {
        return entityManager.createQuery("SELECT c FROM Comment c", Comment.class)
                .getResultList();
    }

    @Override
    public List<Comment> findByUserName(String userName) {
        return entityManager
                .createQuery("SELECT c FROM Comment c WHERE c.userName = :userName", Comment.class)
                .setParameter("userName", userName)
                .getResultList();
    }

    @Override
    @Transactional
    public void DeleteByUserName(String userName) {
        entityManager
                .createQuery("DELETE FROM Comment c WHERE c.userName = :userName")
                .setParameter("userName", userName)
                .executeUpdate();
    }
}
