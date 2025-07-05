package com.example.just_crud.feed.service;

import com.example.just_crud.feed.dto.request.FeedRequest;
import com.example.just_crud.feed.entity.Feed;
import com.example.just_crud.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateFeedService {
    private final FeedRepository feedRepository;
    public void createFeed(FeedRequest request) {
        feedRepository.save(Feed.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .userName(request.getUserName())
                .build()
        );
    }
}
