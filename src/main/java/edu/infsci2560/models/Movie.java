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
public class Movie {

    private static final long serialVersionUID = 1L;

    public enum VideoType {
        Other,
        Highlight,
        Replay,
        Documentary
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected VideoType videoType;

    public Movie() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.videoType = VideoType.Other;
    }

    public Movie(Long id, String name, VideoType videoType) {
        this.id = id;
        this.title = name;
        this.videoType = videoType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", videoType=" + this.videoType + " ]";
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
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the videoType
     */
    public VideoType getVideoType() {
        return videoType;
    }

    /**
     * @param videoType the videoType to set
     */
    public void setVideoType(VideoType videoType) {
        this.videoType = videoType;
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
    public void setId(Long mid) {
        this.id = mid;
    }

}
