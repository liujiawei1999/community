package com.jia.community.model;

import java.math.BigInteger;

public class Question {
    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModify;
    private Integer commentCount;
    private Integer likeCount;
    private String tag;
    private Integer creator;
    private Integer viewCount;

    public Question() {
    }

    public Question(Integer id, String title, String description, Long gmtCreate, Long gmtModify, Integer commentCount, Integer likeCount, String tag, Integer creator, Integer viewCount) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.gmtCreate = gmtCreate;
        this.gmtModify = gmtModify;
        this.commentCount = commentCount;
        this.likeCount = likeCount;
        this.tag = tag;
        this.creator = creator;
        this.viewCount = viewCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Long gmtModify) {
        this.gmtModify = gmtModify;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModify=" + gmtModify +
                ", commentCount=" + commentCount +
                ", likeCount=" + likeCount +
                ", tag='" + tag + '\'' +
                ", creator=" + creator +
                ", viewCount=" + viewCount +
                '}';
    }
}
