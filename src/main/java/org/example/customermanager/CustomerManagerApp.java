package org.example.customermanager;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CustomerManagerApp extends Application {

    @Override
    public void start(Stage stage) {
        TextField nameField = new TextField();
        nameField.setPromptText("e.g., Mary Banda");
        Label nameLabel = new Label("Customer name");
        nameLabel.setLabelFor(nameField);

        ComboBox<String> provinceBox = new ComboBox<>();
        provinceBox.getItems().addAll("Central", "Lusaka", "Copperbelt");
        provinceBox.setPromptText("Choose a province");

        Button saveButton = new Button("Save customer");
        Label status = new Label();

        VBox root = new VBox(10, nameLabel, nameField, provinceBox, saveButton, status);
        stage.setScene(new Scene(root, 350, 250));
        stage.setTitle("Customer Manager");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}