package org.example.graphingtool;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class HoursTrackerController {

    @FXML
    private DatePicker workDatePicker;
    @FXML
    private TextField hoursField;
    @FXML
    private TextField projectField;
    @FXML
    private ListView<String> hoursList;
    @FXML
    private ListView<String> projectList;
    //  Add an FXML button to see expected hours for project
    @FXML
    private void submitHours() {
        String date = workDatePicker.getValue().toString();
        String hours = hoursField.getText();
        String projectID = projectField.getText();

        if (date != null && !hours.isEmpty()  && !projectID.isEmpty()) {
            hoursList.getItems().add(date + ": " + hours + " hours; " + projectID + " Project ID");
            hoursField.clear();
            projectField.clear();
        } else {
            System.out.println("Please enter valid date and hours.");
        }
    }

    @FXML
    private void goToMainMenu() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
            Pane root = loader.load();
            Stage stage = (Stage) hoursField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Main Menu");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
