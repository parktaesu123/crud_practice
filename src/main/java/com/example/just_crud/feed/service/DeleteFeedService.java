package com.example.just_crud.feed.service;

import com.example.just_crud.feed.entity.Feed;
import com.example.just_crud.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteFeedService {
    private final FeedRepository feedRepository;

    public void deleteFeed(String title) {
        Feed feed = feedRepository.findByTitle(title)
                .orElseThrow(() -> new RuntimeException("없는 글"));
        feedRepository.delete(feed);
    }
}
