package com.example.just_crud.feed.service;

import com.example.just_crud.feed.dto.response.FeedResponse;
import com.example.just_crud.feed.entity.Feed;
import com.example.just_crud.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryAllWithoutStreamService {
    private final FeedRepository feedRepository;

    public List<FeedResponse> QueryAllWithoutStream() {
        List<Feed> feeds = feedRepository.findAll(); //Feed 엔티티 조회

        List<FeedResponse> feedResponses = new ArrayList<>(); //리스트 초기화

        for (int i = 0; i< feeds.size(); i++) {
            Feed feed = feeds.get(i); //i번째 객체 가져오기
            FeedResponse feedResponse = new FeedResponse(feed); //feedResponse 객체 생성
            feedResponses.add(feedResponse); //feedResponses에 담기
        }

        return feedResponses;
    }
}
