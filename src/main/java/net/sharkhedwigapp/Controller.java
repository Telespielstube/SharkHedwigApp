package net.sharkhedwigapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label main_label;

    @FXML
    protected void onShippingLabelButtonClick() {

    main_label.setText("Welcome to JavaFX Application!");
    }
}