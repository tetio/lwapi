package com.buzzfactory.lwapi.entity;

import java.util.List;

/**
 * Created by tetio on 17/10/15.
 */
public class Player {
//    Integer id;
    String username;
    List<String> rounds;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRounds() {
        return rounds;
    }

    public void setRounds(List<String> rounds) {
        this.rounds = rounds;
    }
}
