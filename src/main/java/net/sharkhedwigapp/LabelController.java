package net.sharkhedwigapp;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class  LabelController {
    @FXML
    private Text content_header;

    @FXML
    private Text send_info;
    @FXML

    protected void onShippingLabelButtonClick() {
        Main main = new Main();
        content_header.setText("Shipping Label");
        main.changeScene("label-view.fxml");
    }

    @FXML
    protected void onSettingsButtonClick() {
        content_header.setText("Settings");
    }

    @FXML
    protected void onButtonClickSend() {
        send_info.setText("Sent!!");
    }
}
