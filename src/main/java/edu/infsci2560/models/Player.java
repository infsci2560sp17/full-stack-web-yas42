/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author YSun
 */
@Entity
public class Player {


    private static final long serialVersionUID = 1L;
    
    public enum PlayerLevel {
        NFL,
        CFL,
        College,
        Other
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String name;
    protected String team;
    protected PlayerLevel playerLevel;

    public Player() {
        this.id = Long.MAX_VALUE;
        this.name = null;
        this.team = null;
        this.playerLevel = PlayerLevel.Other;
    }

    public Player(Long id, String name, String team, PlayerLevel playerLevel) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.playerLevel = playerLevel;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", name=" + this.name + ", team=" + this.team + ", Player Level=" + this.playerLevel + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return the team name
     */
    public String getTeam() {
        return team;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

     /**
     * @param team the team to set
     */
    public void setTeam(String team) {
        this.team = team;
    }
    
    /**
     * @return the playerLevel
     */
    public PlayerLevel getPlayerLevel() {
        return playerLevel;
    }

    /**
     * @param level the PlayerLevel to set
     */
    public void setPlayerLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}