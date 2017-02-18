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
 * @author Yang Sun
 */
@Entity
public class Highlight {

    private static final long serialVersionUID = 1L;

    public enum VideoType {
        Highlight,
        Replay,
        Documentary,
        Other
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected VideoType videoType;

    public Highlight() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.videoType = VideoType.Other;
    }

    public Highlight(Long id, String name, VideoType videoType) {
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
    public void setId(Long id) {
        this.id = id;
    }

}
