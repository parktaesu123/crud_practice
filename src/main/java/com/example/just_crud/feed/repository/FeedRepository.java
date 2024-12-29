package com.example.just_crud.feed.repository;

import com.example.just_crud.feed.entity.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Long> {

    Optional<Feed> findById(Long id);

    Optional<Feed> findByTitle(String title);
}
