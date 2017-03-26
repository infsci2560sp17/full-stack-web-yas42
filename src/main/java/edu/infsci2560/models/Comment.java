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
public class Comment {

    private static final long serialVersionUID = 1L;

    public enum CommentType {
        Other,
        Player,
        Team,
        College,
        NFL
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String comment;
    protected CommentType commentType;

    public Comment() {
        this.id = Long.MAX_VALUE;
        this.comment = null;
        this.commentType = CommentType.Other;
    }

    public Comment(Long id, String comment, CommentType commentType) {
        this.id = id;
        this.comment = comment;
        this.commentType = commentType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", comment=" + this.comment + ", commentType=" + this.commentType + " ]";
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
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the name to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the commentType
     */
    public CommentType getCommentType() {
        return commentType;
    }

    /**
     * @param commentType the commentType to set
     */
    public void setCommentType(CommentType commentType) {
        this.commentType = commentType;
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
