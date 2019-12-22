package com.company.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "posts", schema = "charity", catalog = "d7jvp9njdlltb3")
public class PostsEntity {
    private long postId;
    private Date postDate;
    private Long postUserId;
    private String postTitle;
    private String postDescription;
    private boolean postIsActive;
    private String postPhoto;
    private String postType;

    @Id
    @Column(name = "post_id")
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "post_date")
    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    @Basic
    @Column(name = "post_user_id")
    public Long getPostUserId() {
        return postUserId;
    }

    public void setPostUserId(Long postUserId) {
        this.postUserId = postUserId;
    }

    @Basic
    @Column(name = "post_title")
    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    @Basic
    @Column(name = "post_description")
    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    @Basic
    @Column(name = "post_is_active")
    public boolean isPostIsActive() {
        return postIsActive;
    }

    public void setPostIsActive(boolean postIsActive) {
        this.postIsActive = postIsActive;
    }

    @Basic
    @Column(name = "post_photo")
    public String getPostPhoto() {
        return postPhoto;
    }

    public void setPostPhoto(String postPhoto) {
        this.postPhoto = postPhoto;
    }

    @Basic
    @Column(name = "post_type")
    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostsEntity that = (PostsEntity) o;
        return postId == that.postId &&
                postIsActive == that.postIsActive &&
                Objects.equals(postDate, that.postDate) &&
                Objects.equals(postUserId, that.postUserId) &&
                Objects.equals(postTitle, that.postTitle) &&
                Objects.equals(postDescription, that.postDescription) &&
                Objects.equals(postPhoto, that.postPhoto) &&
                Objects.equals(postType, that.postType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, postDate, postUserId, postTitle, postDescription, postIsActive, postPhoto, postType);
    }
}
