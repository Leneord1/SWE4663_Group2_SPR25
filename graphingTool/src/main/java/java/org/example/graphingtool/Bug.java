package org.example.graphingtool;

public class Bug {
    private String title;
    private String description;
    private boolean isPatched;

    public Bug(String title, String description, boolean isPatched) {
        this.title = title;
        this.description = description;
        this.isPatched = isPatched;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public boolean isPatched() { return isPatched; }
}
