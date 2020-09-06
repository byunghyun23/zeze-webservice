package com.zeze.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Column(columnDefinition = "DATE")
    private String modifiedDate;

    @Builder
    public Posts(String title, String content, String author, String modifiedDate) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.modifiedDate = modifiedDate;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
