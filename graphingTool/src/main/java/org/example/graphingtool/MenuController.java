package org.example.graphingtool;

import com.almasb.fxgl.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class MenuController  {

    @FXML
    private Label menuText;
    @FXML
    private Label underText;

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
                    searchProject();
                    break;
                case "statusButton":
                    showProjectStatus();
                    break;
                case "hoursButton":
                    showResourceUsage();
                    break;
                case "bugsButton":
                    showBugTracker();
                    break;
                case "exitButton":
                    javafx.application.Platform.exit();
                    break;
                default:
                    System.out.println("You broke the rules");
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void searchProject() {
        System.out.println("Prompting user to search for a project...");
        // Open search dialog or filter project list
    }

    private void showProjectStatus() {
        System.out.println("Displaying project status...");
        // Load FXML for status window or update labels dynamically
    }

    private void showResourceUsage() {
        System.out.println("Showing resource usage and time sheets...");
        // Fetch data from database or display resource allocation screen
    }

    private void showBugTracker() {
        System.out.println("Opening bug tracker...");
        // Load bug tracker FXML or display bug list dynamically
    }


}

