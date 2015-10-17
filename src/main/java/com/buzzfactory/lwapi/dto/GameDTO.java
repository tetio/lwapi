package com.buzzfactory.lwapi.dto;

import com.buzzfactory.lwapi.entity.Player;

import java.util.Date;
import java.util.List;

/**
 * Created by tetio on 17/10/15.
 */
public class GameDTO {
    String id;
    String language;
    Integer num_players;
    Integer max_players;
    String state;
    Integer seed;
    Double doc;
    List<String> used_words;
    List<Player> players;



    public GameDTO(String id, String language, Integer num_players, Integer max_players, String state, Integer seed, Double doc, List<String> used_words, List<Player> players) {
        this.id = id;
        this.language = language;
        this.num_players = num_players;
        this.max_players = max_players;
        this.state = state;
        this.seed = seed;
        this.doc = doc;
        this.used_words = used_words;
        this.players = players;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getNum_players() {
        return num_players;
    }

    public void setNum_players(Integer num_players) {
        this.num_players = num_players;
    }

    public Integer getMax_players() {
        return max_players;
    }

    public void setMax_players(Integer max_players) {
        this.max_players = max_players;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getSeed() {
        return seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public Double getDoc() {
        return doc;
    }

    public void setDoc(Double doc) {
        this.doc = doc;
    }

    public List<String> getUsed_words() {
        return used_words;
    }

    public void setUsed_words(List<String> used_words) {
        this.used_words = used_words;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "GameDTO{" +
                "id='" + id + '\'' +
                ", language='" + language + '\'' +
                ", num_players=" + num_players +
                ", max_players=" + max_players +
                ", state='" + state + '\'' +
                ", seed=" + seed +
                ", doc=" + doc +
                ", used_words=" + used_words +
                ", players=" + players +
                '}';
    }
}
