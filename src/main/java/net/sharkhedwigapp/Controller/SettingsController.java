package net.sharkhedwigapp.Controller;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import net.sharkhedwigapp.Main;

public class SettingsController {
    private Main main = new Main();

    @FXML
    protected void onShippingLabelButtonClick() {
        this.main.changeScene("label-view.fxml");
    }

    @FXML
    protected void onHistoryButtonClick() {
        this.main.changeScene("history-view.fxml");
    }

    @FXML
    protected void onSettingsButtonClick() {
        this.main.changeScene("settings-view.fxml");

    }

    @FXML
    protected void onExitButtonClick() {
        System.exit(0);
    }
}
