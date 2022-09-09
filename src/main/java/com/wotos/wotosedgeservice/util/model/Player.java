package com.wotos.wotosedgeservice.util.model;

public class Player {

    private final Integer accountId;
    private final String nickname;

    public Player(Integer accountId, String nickname) {
        this.accountId = accountId;
        this.nickname = nickname;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public String getNickname() {
        return nickname;
    }
}
