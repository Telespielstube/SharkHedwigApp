package net.sharkhedwigapp.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
//import net.sharkhedwigapp.BluetoothClient;
import net.sharkhedwigapp.Connection.HttpClient;
import net.sharkhedwigapp.Main;

import java.util.Objects;
import java.util.stream.Stream;

public class  LabelController {
    @FXML
    private Text content_header;
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

    private boolean verifyData() {
        return Stream.of(
                sender_field,
                origin_field,
                latitudeOrigin_field,
                longitudeOrigin_field,
                recipient_field,
                destination_field,
                latitudeDest_field,
                longitudeDest_field,
                weight_field).anyMatch(Objects::nonNull);
    }

    @FXML
    protected void onButtonClickSave() {
        if (verifyData()) {

        } else {
            error_text.setText("Some data is wrong. Check again!!");
        }
    }

    @FXML
    protected void onButtonClickSend() {
//        if (verifyData()) {
//         //   new HttpClient().run();
//            send_info.setText("Sent!!");
//        } else {
//            error_text.setText("Some data is wrong. Check again!!");
//        }

    }
}
