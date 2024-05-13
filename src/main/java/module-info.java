module net.sharkhedwigapp.sharkhedwigapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.media;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens net.sharkhedwigapp to javafx.fxml;
    exports net.sharkhedwigapp;
    exports net.sharkhedwigapp.Controller;
    opens net.sharkhedwigapp.Controller to javafx.fxml;
    exports net.sharkhedwigapp.Connection;
    opens net.sharkhedwigapp.Connection to javafx.fxml;
}