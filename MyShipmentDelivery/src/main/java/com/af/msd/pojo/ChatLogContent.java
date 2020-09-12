package com.af.msd.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

public class ChatLogContent implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int chatLogContentId;
    private int chatLogId;
    private String chatContent;
    private Timestamp chatTime;
    private int userId;

    public int getChatLogContentId() {
        return chatLogContentId;
    }

    public int getChatLogId() {
        return chatLogId;
    }

    public String getChatContent() {
        return chatContent;
    }

    public Timestamp getChatTime() {
        return chatTime;
    }

    public int getUserId() {
        return userId;
    }

    public ChatLogContent withChatLogContentId(int chatLogContentId) {
        this.chatLogContentId = chatLogContentId;
        return this;
    }

    public ChatLogContent withChatLogId(int chatLogId) {
        this.chatLogId = chatLogId;
        return this;
    }

    public ChatLogContent withChatContent(String chatContent) {
        this.chatContent = chatContent;
        return this;
    }

    public ChatLogContent withChatTime(Timestamp chatTime) {
        this.chatTime = chatTime;
        return this;
    }

    public ChatLogContent withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public ChatLogContent build(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChatLogContent)) return false;
        ChatLogContent that = (ChatLogContent) o;
        return getChatLogContentId() == that.getChatLogContentId() &&
                getChatLogId() == that.getChatLogId() &&
                getUserId() == that.getUserId() &&
                getChatTime().equals(that.getChatTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChatLogContentId(), getChatLogId(), getChatTime(), getUserId());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ChatLogContent.class.getSimpleName() + "[", "]")
                .add("chatLogContentId=" + chatLogContentId)
                .add("chatLogId=" + chatLogId)
                .add("chatContent='" + chatContent + "'")
                .add("chatTime=" + chatTime)
                .add("userId=" + userId)
                .toString();
    }
}
