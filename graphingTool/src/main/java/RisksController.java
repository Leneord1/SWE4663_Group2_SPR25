package org.example.graphingtool;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RisksController {

    @FXML
    private TextField riskDescriptionField;

    @FXML
    private ChoiceBox<String> severityChoiceBox;

    @FXML
    private ListView<String> riskListView;

    @FXML
    public void initialize(){
        severityChoiceBox.setItems(FXCollections.observableArrayList("Low", "Medium", "High", "Critical"));
        severityChoiceBox.getSelectionModel().selectFirst();
    }
    @FXML
    private void handleAddRisk() {
        String description = riskDescriptionField.getText();
        String severity = severityChoiceBox.getValue();

        if (description == null || description.trim().isEmpty()) {
            showAlert("Input Error", "Please enter a risk description.");
            return;
        }

        String formattedRisk = String.format("[%s] %s", severity, description);
        riskListView.getItems().add(formattedRisk);
        riskDescriptionField.clear();
    }

    @FXML
    private void handleRemoveSelected() {
        String selected = riskListView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            riskListView.getItems().remove(selected);
        } else {
            showAlert("Selection Error", "No risk selected.");
        }
    }

    @FXML
    private void goToMainMenu(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/graphingtool/Menu.fxml"));
            Pane root = loader.load();

            Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Main Menu");
        } catch (Exception e) {
            e.printStackTrace();
            showAlert("Navigation Error", "Could not load the main menu.");
        }
    }


    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    @FXML
    private void handleClearAll() {
        riskListView.getItems().clear(); // Clears all risks from the ListView
    }

}
