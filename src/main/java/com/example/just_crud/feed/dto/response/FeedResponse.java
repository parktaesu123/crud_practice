package com.example.just_crud.feed.dto.response;

import com.example.just_crud.feed.entity.Feed;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedResponse {
    private Long id;
    private String title;
    private String content;
    private String userName;

    public FeedResponse(Feed feed) {
        this.id = feed.getId();
        this.title = feed.getTitle();
        this.content = feed.getContent();
        this.userName = feed.getUserName();
    }
}
