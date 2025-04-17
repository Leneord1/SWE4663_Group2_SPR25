package org.example.graphingtool;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ProjectController {

    @FXML
    private ListView<String> projectList;
    @FXML
    private Label projectStatus;

    public void initialize() {
        // Example projects
        projectList.getItems().add("Graphing Tool - ID: 101 - Manager: Alice");
        projectList.getItems().add("AI Assistant - ID: 102 - Manager: Bob");
    }

    @FXML
    private void onProjectSelected() {
        String selectedProject = projectList.getSelectionModel().getSelectedItem();
        projectStatus.setText("Selected Project: " + selectedProject);
    }
}
