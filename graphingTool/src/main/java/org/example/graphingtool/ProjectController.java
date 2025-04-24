package org.example.graphingtool;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


public class ProjectController {

    @FXML
    private ListView<String> projectList;
    @FXML
    private Label projectStatus;

    public void initialize() {
        // Example projects
        projectList.getItems().add("Graphing Tool - ID: 101 - Manager: Sankalp Amaravadi");
        projectList.getItems().add("AI Assistant - ID: 102 - Manager: Sankalp Amaravadi");
    }

    @FXML
    private void onProjectSelected() {
        String selectedProject = projectList.getSelectionModel().getSelectedItem();
        projectStatus.setText("Selected Project: " + selectedProject);
    }

    @FXML
    private void goToMainMenu(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
            Pane root = loader.load();

            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Main Menu");
        } catch (Exception e) {
            System.err.println("Error loading Menu.fxml: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
