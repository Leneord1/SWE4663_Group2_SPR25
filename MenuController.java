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
                case "insertButton":
                    // Add behavior for Choose Project
                    break;
                case "viewDeleteButton":
                    // Add behavior for Project Overview
                    break;
                case "analyzeButton":
                    // Add behavior for Project Risks
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
                    Pane root = loader.load();

                    Scene newScene = new Scene(root);
                    Stage newStage = new Stage();
                    newStage.setTitle("New Window");
                    newStage.setScene(newScene);
                    newStage.show();

                    Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
                    currentStage.close();
                    break;
                case "Project Risks":
                    //Adds behaviors for showing the project risks
                    break;
                case "exitButton":
                    //behavior for exiting the program
                    javafx.application.Platform.exit();
                    break;
                default:
                    System.out.println("You broke the rules");
                    break;
            }
        } catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        System.out.println("Button pressed: " + sourceButton);
    }


}

