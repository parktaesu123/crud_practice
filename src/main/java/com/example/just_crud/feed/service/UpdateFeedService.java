package com.example.just_crud.feed.service;

import com.example.just_crud.feed.dto.request.FeedRequest;
import com.example.just_crud.feed.entity.Feed;
import com.example.just_crud.feed.repository.FeedRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateFeedService {
    private final FeedRepository feedRepository;


    @Transactional
    public void updateFeed(FeedRequest request, String title) {
        Feed feed = feedRepository.findByTitle(title)
                .orElseThrow(() -> new RuntimeException("nonono"));

        feed.setTitle(request.getTitle());
        feed.setContent(request.getContent());

    }

}
