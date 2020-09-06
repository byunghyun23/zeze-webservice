package com.zeze.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {
    private String title;
    private String content;
    private String modifiedDate;

    @Builder
    public PostsUpdateRequestDto(String title, String content, String modifiedDate) {
        this.title = title;
        this.content = content;
        this.modifiedDate = modifiedDate;
    }
}
