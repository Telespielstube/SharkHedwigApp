package net.sharkhedwigapp.Controller;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import net.sharkhedwigapp.Main;

public class HistoryController {
    private Main main = new Main();

    @FXML
    protected void onShippingLabelButtonClick() {
        main.changeScene("label-view.fxml");
    }

    @FXML
    protected void onHistoryButtonClick() {
        main.changeScene("history-view.fxml");
    }

    @FXML
    protected void onSettingsButtonClick() {
        main.changeScene("settings-view.fxml");
    }

    @FXML
    protected void onExitButtonClick() {
        System.exit(0);
    }
}
