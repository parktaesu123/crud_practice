package com.example.just_crud.feed.service;

import com.example.just_crud.feed.dto.response.FeedResponse;
import com.example.just_crud.feed.entity.Feed;
import com.example.just_crud.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class QueryFeedService2 {
    private final FeedRepository feedRepository;

    @Transactional(readOnly = true)
    public FeedResponse query(Long feedId) {
        Feed feed = feedRepository.findById(feedId)
                .orElseThrow(() -> new RuntimeException("feed Not Found"));

        return FeedResponse.builder()
                .id(feed.getId())
                .title(feed.getTitle())
                .content(feed.getContent())
                .userName(feed.getUserName())
                .build();
    }
}
