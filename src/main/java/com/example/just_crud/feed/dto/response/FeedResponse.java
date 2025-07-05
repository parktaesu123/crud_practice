package com.example.just_crud.feed.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FeedResponse {
    private Long id;
    private String title;
    private String content;
    private String userName;

}
