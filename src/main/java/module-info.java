module net.sharkhedwigapp.sharkhedwigapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.media;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.opencsv;

    opens net.sharkhedwigapp to javafx.fxml;
    exports net.sharkhedwigapp;
    exports net.sharkhedwigapp.Controller;
    opens net.sharkhedwigapp.Controller to javafx.fxml;
    exports net.sharkhedwigapp.Model;
    opens net.sharkhedwigapp.Model to javafx.fxml;
    exports net.sharkhedwigapp.Bean;
    opens net.sharkhedwigapp.Bean to javafx.fxml;
}