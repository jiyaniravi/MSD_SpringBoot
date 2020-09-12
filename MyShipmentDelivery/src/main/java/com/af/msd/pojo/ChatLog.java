package com.af.msd.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.StringJoiner;

public class ChatLog implements Serializable {

    protected static final long serialVersionUID = 90130107005L;

    private int chatLogId;
    private byte chatType;
    private int userId1;
    private int userId2;
    private byte deleteFlagUid1;
    private byte deleteFlagUid2;
    private String user1Session;
    private String user2Session;
    private Timestamp startTime;
    private Timestamp endTime;
    private int sessionEndedBy;

    public int getChatLogId() {
        return chatLogId;
    }

    public byte getChatType() {
        return chatType;
    }

    public int getUserId1() {
        return userId1;
    }

    public int getUserId2() {
        return userId2;
    }

    public byte getDeleteFlagUid1() {
        return deleteFlagUid1;
    }

    public byte getDeleteFlagUid2() {
        return deleteFlagUid2;
    }

    public String getUser1Session() {
        return user1Session;
    }

    public String getUser2Session() {
        return user2Session;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public int getSessionEndedBy() {
        return sessionEndedBy;
    }

    public ChatLog withChatLogId(int chatLogId) {
        this.chatLogId = chatLogId;
        return this;
    }

    public ChatLog withChatType(byte chatType) {
        this.chatType = chatType;
        return this;
    }

    public ChatLog withUserId1(int userId1) {
        this.userId1 = userId1;
        return this;
    }

    public ChatLog withUserId2(int userId2) {
        this.userId2 = userId2;
        return this;
    }

    public ChatLog withDeleteFlagUid1(byte deleteFlagUid1) {
        this.deleteFlagUid1 = deleteFlagUid1;
        return this;
    }

    public ChatLog withDeleteFlagUid2(byte deleteFlagUid2) {
        this.deleteFlagUid2 = deleteFlagUid2;
        return this;
    }

    public ChatLog withUser1Session(String user1Session) {
        this.user1Session = user1Session;
        return this;
    }

    public ChatLog withUser2Session(String user2Session) {
        this.user2Session = user2Session;
        return this;
    }

    public ChatLog withStartTime(Timestamp startTime) {
        this.startTime = startTime;
        return this;
    }

    public ChatLog withEndTime(Timestamp endTime) {
        this.endTime = endTime;
        return this;
    }

    public ChatLog withSessionEndedBy(int sessionEndedBy) {
        this.sessionEndedBy = sessionEndedBy;
        return this;
    }

    public ChatLog build(){
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChatLog)) return false;
        ChatLog chatLog = (ChatLog) o;
        return getChatLogId() == chatLog.getChatLogId() &&
                getChatType() == chatLog.getChatType() &&
                getUserId1() == chatLog.getUserId1() &&
                getUserId2() == chatLog.getUserId2() &&
                getUser1Session().equals(chatLog.getUser1Session()) &&
                getUser2Session().equals(chatLog.getUser2Session()) &&
                getStartTime().equals(chatLog.getStartTime()) &&
                getEndTime().equals(chatLog.getEndTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChatLogId(), getChatType(), getUserId1(), getUserId2(), getUser1Session(), getUser2Session(), getStartTime(), getEndTime());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ChatLog.class.getSimpleName() + "[", "]")
                .add("chatLogId=" + chatLogId)
                .add("chatType=" + chatType)
                .add("userId1=" + userId1)
                .add("userId2=" + userId2)
                .add("deleteFlagUid1=" + deleteFlagUid1)
                .add("deleteFlagUid2=" + deleteFlagUid2)
                .add("startTime=" + startTime)
                .add("endTime=" + endTime)
                .add("sessionEndedBy=" + sessionEndedBy)
                .toString();
    }
}
