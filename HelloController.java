package org.example.graphingtool;

import com.almasb.fxgl.entity.action.Action;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label underText;
    @FXML
    private void initialize() {
        welcomeText.setText("Welcome!");
    }

    public void onHelloPress(ActionEvent event) throws Exception{
        try{
            underText.setText("Button Pressed");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
            Pane root = loader.load();

            Scene newScene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setTitle("New Window");
            newStage.setScene(newScene);
            newStage.show();

            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}