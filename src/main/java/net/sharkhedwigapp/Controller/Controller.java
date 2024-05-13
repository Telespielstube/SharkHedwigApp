package net.sharkhedwigapp.Controller;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import net.sharkhedwigapp.Main;

public class Controller {
    @FXML
    private Text content_header;
    @FXML
    private LabelController labelController;
    @FXML
    private SettingsController settingsController;
    private Main main;

    public Controller() {
        this.labelController = new LabelController();
        this.settingsController = new SettingsController();
    }

    @FXML
    protected void onShippingLabelButtonClick() {
        this.main = new Main();
        content_header.setText("Shipping Label");
        main.changeScene("label-view.fxml");
    }

    @FXML
    protected void onSettingsButtonClick() {
        content_header.setText("Settings");
        main.changeScene("settings-view.fxml");

    }


}