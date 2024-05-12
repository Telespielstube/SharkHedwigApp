package net.sharkhedwigapp;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import java.util.Set;

public class Controller {
    @FXML
    private Text content_header;
    @FXML
    private LabelController labelController;
    @FXML
    private SettingsController settingsController;

    public Controller() {
        this.labelController = new LabelController();
        this.settingsController = new SettingsController();
    }

    @FXML
    protected void onShippingLabelButtonClick() {
        Main main = new Main();
        content_header.setText("Shipping Label");
        this.labelController.showForm();
        main.changeScene("label-view.fxml");
    }

    @FXML
    protected void onSettingsButtonClick() {
        content_header.setText("Settings");

    }


}