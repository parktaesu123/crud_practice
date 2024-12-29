package com.example.just_crud.feed.controller;

import com.example.just_crud.feed.dto.request.FeedRequest;
import com.example.just_crud.feed.dto.response.FeedResponse;
import com.example.just_crud.feed.entity.Feed;
import com.example.just_crud.feed.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feed")
@RequiredArgsConstructor
public class FeedController {
    private final CreateFeedService createFeedService;
    private final QueryFeedService queryFeedService;
    private final QueryAllFeedService queryAllFeedService;
    private final QueryAllWithoutStreamService queryAllWithoutStreamService;
    private final DeleteFeedService deleteFeedService;
    private final UpdateFeedService updateFeedService;

    @PostMapping("/create")
    public void createFeed(@RequestBody FeedRequest request) {
        createFeedService.createFeed(request);
    }

    @GetMapping("/{id}")
    public FeedResponse queryFeed(@PathVariable Long id) {
        return queryFeedService.queryFeed(id);
    }

    @GetMapping("/all")
    public List<FeedResponse> queryAllFeed() {
        return queryAllFeedService.queryAllFeed();
    }

    @GetMapping("/allall")
    public List<FeedResponse> queryAllWithoutStream() {
        return queryAllWithoutStreamService.QueryAllWithoutStream();
    }

    @DeleteMapping("/{title}")
    public void deleteFeed(@PathVariable String title) {
        deleteFeedService.deleteFeed(title);
    }

    @PatchMapping("/{title}")
    public void updateFeed(@PathVariable String title, @RequestBody FeedRequest request) {
        updateFeedService.updateFeed(request, title);
    }
}
