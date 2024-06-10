package net.sharkhedwigapp.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import net.sharkhedwigapp.Main;
import net.sharkhedwigapp.Model.ShippingLabel;
import net.sharkhedwigapp.Model.Writer;

public class  LabelController {
    @FXML
    private Text send_info;
    @FXML
    private TextField sender_field;
    @FXML
    private TextField origin_field;
    @FXML
    private TextField latitudeOrigin_field;
    @FXML
    private TextField longitudeOrigin_field;
    @FXML
    private TextField recipient_field;
    @FXML
    private TextField destination_field;
    @FXML
    private TextField latitudeDest_field;
    @FXML
    private TextField longitudeDest_field;
    @FXML
    private TextField weight_field;
    @FXML
    private Text error_text;
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

    @FXML
    protected void onSaveButtonClick() {
        if (verifyData()) {
            Writer.writeData(new ShippingLabel(sender_field.getText(), origin_field.getText(), latitudeOrigin_field.getText(),
                    longitudeOrigin_field.getText(), recipient_field.getText(), destination_field.getText(),
                    latitudeDest_field.getText(), longitudeDest_field.getText(), weight_field.getText()));
        } else {
            error_text.setText("Some data is wrong. Check again!!");
        }
    }

    @FXML
    protected void onButtonClickSend() {
        if (verifyData()) {

            send_info.setText("Sent!!");
        } else {
            error_text.setText("Some data is wrong. Check again!!");
        }
    }

    private boolean verifyData() {
        return sender_field.getText().trim().isBlank() || origin_field.getText().trim().isBlank() || latitudeOrigin_field.getText().trim().isBlank()
                || longitudeOrigin_field.getText().trim().isBlank() || recipient_field.getText().trim().isBlank() || destination_field.getText().trim().isBlank()
                || latitudeDest_field.getText().trim().isBlank() || longitudeDest_field.getText().trim().isBlank() || weight_field.getText().trim().isBlank()
                ? false
                : true;
    }
}
