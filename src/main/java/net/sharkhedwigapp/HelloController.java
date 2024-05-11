package net.sharkhedwigapp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class HelloController {
    @FXML
    private Label main_label;

    @FXML
    protected void onShippingLabelButtonClick() {

    main_label.setText("Welcome to JavaFX Application!");
    }
}