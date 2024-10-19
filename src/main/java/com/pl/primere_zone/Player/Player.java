package com.pl.primere_zone.Player;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name = "player_stats")
public class Player {

    @Id
    @Column(name = "player_name", length = 100)
    private String playerName;

    @Column(name = "nation", length = 50)
    private String nation;

    @Column(name = "position", length = 10)
    private String position;

    @Column(name = "age")
    private Integer age;

    @Column(name = "matches_played")
    private Integer matchesPlayed;

    @Column(name = "starts")
    private Integer starts;

    @Column(name = "minutes_played")
    private Float minutesPlayed;

    @Column(name = "goals")
    private Float goals;

    @Column(name = "assists")
    private Float assists;

    @Column(name = "penalties_scored")
    private Float penaltiesScored;

    @Column(name = "yellow_cards")
    private Float yellowCards;

    @Column(name = "red_cards")
    private Float redCards;

    @Column(name = "expected_goals")
    private Float expectedGoals;

    @Column(name = "expected_assists")
    private Float expectedAssists;

    @Column(name = "team_name", length = 100)
    private String teamName;

    // Getters and Setters

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Float getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Float minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Float getGoals() {
        return goals;
    }

    public void setGoals(Float goals) {
        this.goals = goals;
    }

    public Float getAssists() {
        return assists;
    }

    public void setAssists(Float assists) {
        this.assists = assists;
    }

    public Float getPenaltiesScored() {
        return penaltiesScored;
    }

    public void setPenaltiesScored(Float penaltiesScored) {
        this.penaltiesScored = penaltiesScored;
    }

    public Float getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Float yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Float getRedCards() {
        return redCards;
    }

    public void setRedCards(Float redCards) {
        this.redCards = redCards;
    }

    public Float getExpectedGoals() {
        return expectedGoals;
    }

    public void setExpectedGoals(Float expectedGoals) {
        this.expectedGoals = expectedGoals;
    }

    public Float getExpectedAssists() {
        return expectedAssists;
    }

    public void setExpectedAssists(Float expectedAssists) {
        this.expectedAssists = expectedAssists;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", nation='" + nation + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", matchesPlayed=" + matchesPlayed +
                ", starts=" + starts +
                ", minutesPlayed=" + minutesPlayed +
                ", goals=" + goals +
                ", assists=" + assists +
                ", penaltiesScored=" + penaltiesScored +
                ", yellowCards=" + yellowCards +
                ", redCards=" + redCards +
                ", expectedGoals=" + expectedGoals +
                ", expectedAssists=" + expectedAssists +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
