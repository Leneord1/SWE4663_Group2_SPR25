package org.example.graphingtool;

public class Project {
    private String name;
    private String projectManager;
    private String projectID;
    private String status;

    public Project(String name, String projectManager, String projectID, String status) {
        this.name = name;
        this.projectManager = projectManager;
        this.projectID = projectID;
        this.status = status;
    }

    public String getName() { return name; }
    public String getProjectManager() { return projectManager; }
    public String getProjectID() { return projectID; }
    public String getStatus() { return status; }
}
