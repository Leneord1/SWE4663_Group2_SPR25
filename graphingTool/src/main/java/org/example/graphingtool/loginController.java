package org.example.graphingtool;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class loginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Replace the if check statement with login database
        if ("admin".equals(username) && "1234".equals(password)) {
            errorLabel.setText("Login successful!");
            try{
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
        } else {
            errorLabel.setText("Invalid username or password.");
        }
    }
}
;

