package com.example.just_crud.feed.service;

import com.example.just_crud.feed.dto.response.FeedResponse;
import com.example.just_crud.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryAllFeedService {
    private final FeedRepository feedRepository;

    public List<FeedResponse> queryAllFeed() {
        List<FeedResponse> feedResponses = feedRepository.findAll()
                .stream()
                .map(feed -> new FeedResponse(feed))
                .collect(Collectors.toList());

        return feedResponses;
    }

}
