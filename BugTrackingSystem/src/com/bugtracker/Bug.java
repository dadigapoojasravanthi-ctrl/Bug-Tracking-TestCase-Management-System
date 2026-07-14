package com.bugtracker;

public class Bug {

    private int bugId;
    private String title;
    private String description;
    private String priority;
    private String status;
    private String reportedBy;

    // Default Constructor
    public Bug() {

    }

    // Parameterized Constructor
    public Bug(String title, String description,
               String priority, String status,
               String reportedBy) {

        this.title = title;
        this.description = description;
        this.priority = priority;
        this.status = status;
        this.reportedBy = reportedBy;
    }

    public int getBugId() {
        return bugId;
    }

    public void setBugId(int bugId) {
        this.bugId = bugId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }
}