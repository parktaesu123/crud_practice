package com.example.crud_practice.feed.service;

import com.example.crud_practice.feed.dto.request.FeedRequest;
import com.example.crud_practice.feed.entity.Feed;
import com.example.crud_practice.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateFeedService {
    private final FeedRepository feedRepository;
    public void createFeed(FeedRequest request) {
        Feed feed = Feed.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .userName(request.getUserName())
                .build();

        feedRepository.save(feed);
    }
}
