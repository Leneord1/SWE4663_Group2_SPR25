package org.example.graphingtool;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MenuController {

    @FXML
    private Label menuText;

    @FXML
    private void initialize() {
        menuText.setText("Welcome!");
    }

    @FXML
    private void onMenuButtonClick(ActionEvent event) {
        Button sourceButton = (Button) event.getSource();
        String buttonID = sourceButton.getId();

        try {
            switch (buttonID) {
                case "searchButton":
                    loadScene("Project.fxml", event);
                    break;
                case "statusButton":
                    loadScene("Project.fxml", event);
                    break;
                case "hoursButton":
                    loadScene("hoursTracker.fxml", event);
                    break;
                case "bugsButton":
                    loadScene("Bug.fxml", event);
                    break;
                case "RisksButton":
                    loadScene("Risks.fxml", event);
                    break;
                case "exitButton":
                    Platform.exit();
                    break;
                default:
                    System.out.println("Invalid button action.");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadScene(String sceneName, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(sceneName));
            Pane root = loader.load();

            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("New View");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
