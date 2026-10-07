package org.example.customermanager;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CustomerManagerApp extends Application {

    @Override
    public void start(Stage stage) {
        ObservableList<Customer> customers = FXCollections.observableArrayList();
        TextField nameField = new TextField();
        nameField.setPromptText("e.g., Mary Banda");
        Label nameLabel = new Label("Customer name");
        nameLabel.setLabelFor(nameField);

        ComboBox<String> provinceBox = new ComboBox<>();
        provinceBox.getItems().addAll("Central", "Lusaka", "Copperbelt");
        provinceBox.setPromptText("Choose a province");

        Button saveButton = new Button("Save customer");
        Label status = new Label();
        TableView<Customer> table = new TableView<>();
        table.setItems(customers);

        TableColumn<Customer, String> nameCol = new TableColumn<>("Customer name");
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Customer, String> provinceCol = new TableColumn<>("Province");
        provinceCol.setCellValueFactory(new PropertyValueFactory<>("province"));

        table.getColumns().add(nameCol);
        table.getColumns().add(provinceCol);

        customers.add(new Customer("Mary", "Central"));

        VBox root = new VBox(10, nameLabel, nameField, provinceBox, saveButton, status, table);
        stage.setScene(new Scene(root, 400, 450));
        stage.setTitle("Customer Manager");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}