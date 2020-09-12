package com.af.msd.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

public class Review implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int reviewId;
    private int userId;
    private int orderId;
    private byte rating;
    private String comment;
    private Timestamp ratingDate;
    private Timestamp commentDate;

    public int getReviewId() {
        return reviewId;
    }

    public int getUserId() {
        return userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public byte getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public Timestamp getRatingDate() {
        return ratingDate;
    }

    public Timestamp getCommentDate() {
        return commentDate;
    }

    public Review withReviewId(int reviewId) {
        this.reviewId = reviewId;
        return this;
    }

    public Review withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public Review withOrderId(int orderId) {
        this.orderId = orderId;
        return this;
    }

    public Review withRating(byte rating) {
        this.rating = rating;
        return this;
    }

    public Review withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Review withRatingDate(Timestamp ratingDate) {
        this.ratingDate = ratingDate;
        return this;
    }

    public Review withCommentDate(Timestamp commentDate) {
        this.commentDate = commentDate;
        return this;
    }

    public Review build(){
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Review)) return false;
        Review review = (Review) o;
        return getReviewId() == review.getReviewId() &&
                getUserId() == review.getUserId() &&
                getOrderId() == review.getOrderId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReviewId(), getUserId(), getOrderId());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Review.class.getSimpleName() + "[", "]")
                .add("reviewId=" + reviewId)
                .add("userId=" + userId)
                .add("orderId=" + orderId)
                .add("rating=" + rating)
                .add("comment='" + comment + "'")
                .add("ratingDate=" + ratingDate)
                .add("commentDate=" + commentDate)
                .toString();
    }
}
