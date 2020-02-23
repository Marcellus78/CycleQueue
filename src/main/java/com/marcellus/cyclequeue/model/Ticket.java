package com.marcellus.cyclequeue.model;

import java.util.Date;

public class Ticket {

    private Long id;
    private Date createdAt;
    private Date closedAt;
    private Type type;

    public Ticket(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public static enum Type{
        LEAGAL, PACKAGE, OTHER
    }
}
