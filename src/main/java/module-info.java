module net.sharkhedwigapp.sharkhedwigapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.media;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens net.sharkhedwigapp to javafx.fxml;
    exports net.sharkhedwigapp;
}