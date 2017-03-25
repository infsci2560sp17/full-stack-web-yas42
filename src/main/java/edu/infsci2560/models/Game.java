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
public class Game {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long gid;
    protected String home;
    protected String away;
    protected Long season;
    protected String comment;

    public Game() {
        this.gid = Long.MAX_VALUE;
        this.home = null;
        this.away = null;
        this.season = Long.MAX_VALUE;
        this.comment = null;
    }

    public Game(Long gid, String home, String away, long season, String comment) {
        this.gid = gid;
        this.home = home;
        this.away = away;
        this.season = season;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "[ gid=" + this.gid + ", home=" + this.home + ", away=" + this.away + ", season=" + this.season + ", comment=" + this.comment + " ]";
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
     * @return the home
     */
    public String getHome() {
        return home;
    }

    /**
     * @param home the name to set
     */
    public void setHome(String home) {
        this.home = home;
    }
    
    /**
     * @return the away
     */
    public String getAway() {
        return away;
    }

    /**
     * @param away the away to set
     */
    public void setAway(String away) {
        this.away = away;
    }

    /**
     * @return the season
     */
    public Long getSeason() {
        return season;
    }

    /**
     * @param season the season to set
     */
    public void setSeason(Long season) {
        this.season = season;
    }
    
    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * @return the id
     */
    public Long getGId() {
        return gid;
    }

    /**
     * @param id the id to set
     */
    public void setGId(Long gid) {
        this.gid = gid;
    }

}
