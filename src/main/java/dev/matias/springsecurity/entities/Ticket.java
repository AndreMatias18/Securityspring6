package dev.matias.springsecurity.entities;


import jakarta.persistence.*;

import java.util.Date;

@Table(name = "tb_ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String status; // OPEN, IN_PROGRESS, CLOSED

    private String priority; // LOW, MEDIUM, HIGH, CRITICAL

    private String category; // I Can create a table to reference any category's became the user can create more in backoffice

    private boolean remoteAccessAllowed; // if he needs remote access for resolve any problems

    private Date createdAt; // date when worker create ticket

    private Date updatedAt; // date when dev see and start resolve

    private Date resolvedAt; // finish date for ticket

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private User assignedTo; // for know who was responsible for the resolution


    public Ticket(Long ticketId, User user, String title, String content, String status, String priority, String category, boolean remoteAccessAllowed, Date createdAt, Date updatedAt, Date resolvedAt, User assignedTo) {
        this.ticketId = ticketId;
        this.user = user;
        this.title = title;
        this.content = content;
        this.status = status;
        this.priority = priority;
        this.category = category;
        this.remoteAccessAllowed = remoteAccessAllowed;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.resolvedAt = resolvedAt;
        this.assignedTo = assignedTo;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isRemoteAccessAllowed() {
        return remoteAccessAllowed;
    }

    public void setRemoteAccessAllowed(boolean remoteAccessAllowed) {
        this.remoteAccessAllowed = remoteAccessAllowed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(Date resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }
}

