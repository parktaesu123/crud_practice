package com.example.crud_practice.feed.controller;

import com.example.crud_practice.feed.dto.request.FeedRequest;
import com.example.crud_practice.feed.service.CreateFeedService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feed")
@RequiredArgsConstructor
public class FeedController {
    private final CreateFeedService createFeedService;

    @PostMapping("/create")
    public void createFeed(@RequestBody FeedRequest request) {
        createFeedService.createFeed(request);
    }
}
