package org.example.graphingtool;

import java.util.ArrayList;
import java.util.List;

public class BugController {
    private List<String> patchedBugs = new ArrayList<>();
    private List<String> unpatchedBugs = new ArrayList<>();

    public void addBug(String bugDescription, boolean isPatched) {
        if (isPatched) {
            patchedBugs.add(bugDescription);
        } else {
            unpatchedBugs.add(bugDescription);
        }
    }

    public List<String> getPatchedBugs() { return patchedBugs; }
    public List<String> getUnpatchedBugs() { return unpatchedBugs; }
}
