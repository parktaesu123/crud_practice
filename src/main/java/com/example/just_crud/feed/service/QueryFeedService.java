package com.example.just_crud.feed.service;

import com.example.just_crud.feed.dto.response.FeedResponse;
import com.example.just_crud.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QueryFeedService {
    private final FeedRepository feedRepository;

    public FeedResponse queryFeed(Long id) {
        return feedRepository.findById(id)
                .map(feed -> new FeedResponse(feed)) //optional<FeedResponse>로 변환
                .orElseThrow(() -> new RuntimeException("존재하지 않은 글입니다."));

    }
}
