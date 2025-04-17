package org.example.graphingtool;

import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;


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


