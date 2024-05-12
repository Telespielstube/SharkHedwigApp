package net.sharkhedwigapp;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class LabelController {
    @FXML
    private Text content_header;
    @FXML
    private LabelController labelController;
    @FXML
    private SettingsController settingsController;
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
    public void showForm() {
    }
}
